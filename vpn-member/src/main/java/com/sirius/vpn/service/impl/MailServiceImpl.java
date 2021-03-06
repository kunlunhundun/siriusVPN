package com.sirius.vpn.service.impl;

import com.sirius.vpn.common.api.ResultCode;
import com.sirius.vpn.common.exception.Asserts;
import com.sirius.vpn.domain.MailInfo;
import com.sirius.vpn.mapper.UmsMemberMapper;
import com.sirius.vpn.model.UmsMember;
import com.sirius.vpn.model.UmsMemberExample;
import com.sirius.vpn.service.MailService;
import com.sirius.vpn.service.UmsMemberCacheService;
import com.sirius.vpn.service.UmsMemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.*;


import java.util.*;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSenderImpl mailSender;//注入邮件工具类

    @Autowired
    private TemplateEngine templateEngine;


    @Autowired
    private UmsMemberCacheService memberCacheService;

    @Autowired
    private UmsMemberMapper memberMapper;

    private Logger logger = LoggerFactory.getLogger(getClass());//提供日志类


    @Override
    public void generateCode(String emailUser,int use) {
        if (use == 1) {
            sendEmailToUser(emailUser,use);
        } else if (use == 2) {

            UmsMemberExample example = new UmsMemberExample();
            example.createCriteria().andUsernameEqualTo(emailUser);
            List<UmsMember> memberList = memberMapper.selectByExample(example);
            if (!CollectionUtils.isEmpty(memberList)) {
                sendEmailToUser(emailUser,use);

            } else  {
                Asserts.fail(ResultCode.UNFINDUSER);
            }
        }
    }

    void sendEmailToUser(String emailUser,int use) {
        //通过username 不用关心是用户是找密码还是注册等用途
        String userName = emailUser + "use" + String.valueOf(use);
        String code = memberCacheService.getEmailAuthCode(userName);
        String subject = "";
        String verificationTip = "";

        String tipRegister = "Register account is";
        String subRegister = "Register Verification";
        String tipPassword = "password reset is";
        String subPassword = "Password Reset Verification";

        if (use == 1) {
            subject = subRegister;
            verificationTip = tipRegister;
        } else  {
            subject = subPassword;
            verificationTip = tipPassword;
        }

        if (!StringUtils.isEmpty(code)) {
            Asserts.fail(ResultCode.REPEATSENDCODE);
           logger.info("之前已经发送过验证码，请查看邮箱");
            return;
        }

        MailInfo mailVo = new MailInfo();
        mailVo.setTo(emailUser);
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(random.nextInt(10));
        }

        Context context = new Context();
        context.setVariable("email", emailUser);
        context.setVariable("code", stringBuilder.toString());
        context.setVariable("verification", verificationTip);
        String emailTemplate = "emailTemplate";
        String templateContent = templateEngine.process(emailTemplate, context);

        mailVo.setSubject(subject);
        mailVo.setText(templateContent);
        String fromUser = getMailSendFrom();
        mailVo.setFrom(fromUser);//邮件发信人从配置项读取

        MailInfo result =  sendMail(mailVo);
        if (!result.getStatus().equals("ok")){
            Asserts.fail("send email failed");
        }
        memberCacheService.setEmailAuthCode(userName,stringBuilder.toString());
    }

    @Override
    public Boolean verifyCode(String emailUser, String code, int use) {

        String userName = emailUser + "use" + String.valueOf(use);

        String cacheCode = memberCacheService.getEmailAuthCode(userName);
        if (cacheCode == null) {
            Asserts.fail(ResultCode.TIMEOUTCODE);
        }
       if (cacheCode.equals(code)) {
           return true;
       }
       return false;
    }

    /**
     * 发送邮件
     */
    public MailInfo sendMail(MailInfo mailVo) {
        try {
            checkMail(mailVo); //1.检测邮件
            sendMimeMail(mailVo); //2.发送邮件
            return saveMail(mailVo); //3.保存邮件
        } catch (Exception e) {
            logger.error("发送邮件失败:", e);//打印错误信息
            mailVo.setStatus("fail");
            mailVo.setError(e.getMessage());
            return mailVo;
        }

    }


    //构建复杂邮件信息类
    private void sendMimeMail(MailInfo mailVo) {
        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mailSender.createMimeMessage(), true);//true表示支持复杂类型
            messageHelper.setFrom(mailVo.getFrom());//邮件发信人
            messageHelper.setTo(mailVo.getTo().split(","));//邮件收信人
            messageHelper.setSubject(mailVo.getSubject());//邮件主题
            messageHelper.setText(mailVo.getText(),true);//邮件内容
            if (!StringUtils.isEmpty(mailVo.getCc())) {//抄送
                messageHelper.setCc(mailVo.getCc().split(","));
            }
            if (!StringUtils.isEmpty(mailVo.getBcc())) {//密送
                messageHelper.setCc(mailVo.getBcc().split(","));
            }
            if (mailVo.getMultipartFiles() != null) {//添加邮件附件
                for (MultipartFile multipartFile : mailVo.getMultipartFiles()) {
                    messageHelper.addAttachment(multipartFile.getOriginalFilename(), multipartFile);
                }
            }
            if (StringUtils.isEmpty(mailVo.getSentDate())) {//发送时间
                mailVo.setSentDate(new Date());
                messageHelper.setSentDate(mailVo.getSentDate());
            }

            Properties properties = new Properties();
            properties.setProperty("mail.transport.protocol", "smtp");
            properties.setProperty("mail.smtp.auth", "true");  // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
          //  properties.setProperty("mail.smtp.starttls.enable", "true");
            properties.setProperty("mail.debug", "true");
            properties.setProperty("mail.smtp.ssl.enable","true");

            mailSender.setJavaMailProperties(properties);
            mailSender.send(messageHelper.getMimeMessage());//正式发送邮件
            mailVo.setStatus("ok");
            logger.info("发送邮件成功：{}->{}", mailVo.getFrom(), mailVo.getTo());
        } catch (Exception e) {
            throw new RuntimeException(e);//发送失败
        }
    }


    //检测邮件信息类
    private void checkMail(MailInfo mailVo) {
        if (StringUtils.isEmpty(mailVo.getTo())) {
            throw new RuntimeException("email send address is empty");
        }
        if (StringUtils.isEmpty(mailVo.getSubject())) {
            throw new RuntimeException("email subjec is empty");
        }
        if (StringUtils.isEmpty(mailVo.getText())) {
            throw new RuntimeException("email content is empty");
        }
    }


    //保存邮件
    private MailInfo saveMail(MailInfo mailVo) {
        //将邮件保存到数据库..
        return mailVo;
    }

    //获取邮件发信人
    public String getMailSendFrom() {

        String fromUser = "kunlunhundun@gmail.com"; //"service@syrinxvpn.com";
        logger.info("getmailsendFrom---->>>>" + fromUser + "\n");
        return fromUser;
    }



}

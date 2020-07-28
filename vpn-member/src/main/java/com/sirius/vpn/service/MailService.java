package com.sirius.vpn.service;

import com.sirius.vpn.domain.MailInfo;

public interface MailService {

    void generateCode(String emailUser, int use);

    Boolean verifyCode( String emailUser, String  code, int use);

    MailInfo sendMail(MailInfo mailInfo);

}

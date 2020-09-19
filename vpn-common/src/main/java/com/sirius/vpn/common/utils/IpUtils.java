package com.sirius.vpn.common.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class IpUtils {

    private static final Logger logger = LoggerFactory.getLogger(IpUtils.class);

    public static String getIpAddr(HttpServletRequest request) {
        String ipAddress = null;
        try {

          /*  if (request.getHeader("X-Real-IP") == null) {  // 真实地址
                String tempIpAddress = request.getHeader("X-Real-IP");
                logger.info("X-Real-IP--log" + tempIpAddress);
            }
            if (request.getHeader("x-forwarded-for") == null) { // nginx 第一层转发钱的地址
               String tempIpAddress = request.getHeader("x-forwarded-for");
                logger.info("x-forwarded-for--" + tempIpAddress);
            }
            if (request.getHeader("Proxy-Client-IP") == null) {
                String tempIpAddress = request.getHeader("Proxy-Client-IP");
                logger.info("Proxy-Client-IP--" + tempIpAddress);
            }
            if (request.getHeader("WL-Proxy-Client-IP") == null) {
                String tempIpAddress = request.getHeader("WL-Proxy-Client-IP");
                logger.info("WL-Proxy-Client-IP--" + tempIpAddress);
            }
            String tempIpAddress = request.getRemoteAddr();
            logger.info("getRemoteAddr--" + tempIpAddress);
            if (tempIpAddress.length() > 1) {
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    logger.error("获取用户的主机发生异常",e);
                }
                 tempIpAddress = inet.getHostAddress();
                logger.info("获取用户的主机" + tempIpAddress);
            } */

            ipAddress = request.getHeader("x-forwarded-for");
            logger.info("x-forwarded-for" + ipAddress);

            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("Proxy-Client-IP");
                logger.info("Proxy-Client-IP" + ipAddress);

            }
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("WL-Proxy-Client-IP");
                logger.info("WL-Proxy-Client-IP" + ipAddress);
            }
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getRemoteAddr();
                logger.info("getRemoteAddr" + ipAddress);
                if (ipAddress.equals("127.0.0.1")) {
                    // 根据网卡取本机配置的IP
                    InetAddress inet = null;
                    try {
                        inet = InetAddress.getLocalHost();
                    } catch (UnknownHostException e) {
                        logger.error("获取用户的主机发生异常",e);
                    }
                    ipAddress = inet.getHostAddress();
                }
            }
            // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
            if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
                // = 15
                if (ipAddress.indexOf(",") > 0) {
                    ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
                    logger.info("ipAddress.substring" + ipAddress);
                }
            }
        } catch (Exception e) {
            ipAddress="";
            logger.error("获取用户的ip地址发生异常",e);
        }
        // ipAddress = this.getRequest().getRemoteAddr();

        return ipAddress;
    }


    public static long ip2Long(String ip){
        String[] items = ip.split("\\.");
        if (items.length != 4) {
            items = ip.split("\\.");
        }
        if (items.length != 4) {
            return 3117390050L;
        }
        return Long.valueOf(items[0])<<24
                |Long.valueOf(items[1])<<16
                |Long.valueOf(items[2])<<8
                |Long.valueOf(items[3]);
    }

}

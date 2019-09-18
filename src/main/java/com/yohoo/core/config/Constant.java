package com.yohoo.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Linxi
 * @Description: 系统常量
 * @date 2019年2月20日
 */
@Configuration
public class Constant {

    /**
     * 图片访问域名地址
     */
    public static String DOMAIN_NAME;


    /**
     * 微信支付证书位置
     */
    public static String CERT_PATH;

    /**
     * 附件上传地址
     */
    public static String SYS_FILE_UPLOAD_URL_PATH;



    @Value("${cert_path}")
    public void setCertPath(String certPath) {
        CERT_PATH = certPath;
    }

    @Value("${domain_name}")
    public void setDomainName(String domainName) {
        DOMAIN_NAME = domainName;
    }

    @Value("${upload_path}")
    public void setSysFileUploadUrlPath(String path) {
        SYS_FILE_UPLOAD_URL_PATH = path;
    }
}

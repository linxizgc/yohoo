package com.yohoo.upload;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * Created by kaikentule on 2018/10/19.
 */
@Configuration
public class FileUpload {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("5120KB");
        factory.setMaxRequestSize("10240KB");
        return factory.createMultipartConfig();
    }
}

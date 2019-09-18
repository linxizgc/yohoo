package com.yohoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.yohoo"})
//@ComponentScan({"com.yohoo"})
@MapperScan("com.yohoo.*.dao")
@EnableScheduling
public class YohooApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(YohooApplication.class, args);
    }

}

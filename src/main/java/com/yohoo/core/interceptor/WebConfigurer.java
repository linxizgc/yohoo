package com.yohoo.core.interceptor;

import com.yohoo.core.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaikentule on 2019/3/7.
 */
//@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;


    private static String excludePath;

    private static List<String> excludePaths;

    @Value("${exclude_path}")
    public void setExcludePath(String exclude_path) {
        this.excludePath = exclude_path;
    }

    static {
        excludePaths = new ArrayList<>();
    }


    // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/css/");
//        registry.addResourceHandler("/docs/**").addResourceLocations("classpath:/docs/");
//        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/img/");
//        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
//        registry.addResourceHandler("/plugin/**").addResourceLocations("classpath:/plugin/");
//        registry.addResourceHandler("/plugins/**").addResourceLocations("classpath:/plugins/");
    }

    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] split = excludePath.split(",");
        for (int i = 0; i < split.length; i++) {
            excludePaths.add(split[i]);
        }
        // addPathPatterns("/**") 表示拦截所有的请求，
        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns(excludePaths);

    }
}

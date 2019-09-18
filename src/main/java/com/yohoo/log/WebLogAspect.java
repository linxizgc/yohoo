package com.yohoo.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

@Aspect
@Component
public class WebLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    @Pointcut("execution(public * com.yohoo.controller.*.*(..))")
    public void webLog() {

    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(" ");
        logger.info("times：" + df.format(new Date()));
        logger.info("url:" + request.getRequestURI().toString());
        logger.info("method:" + request.getMethod());
        logger.info("ip:" + request.getRemoteAddr());
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String name = String.valueOf(enu.nextElement());
            logger.info("name:{},value:{}", name, request.getParameter(name));
            name = null;
        }
    }

    @AfterReturning(returning = "obj", pointcut = "webLog()")
    public void doAfter(Object obj) throws Throwable {
        logger.info("response:" + obj);
        logger.info(" ");
    }
}

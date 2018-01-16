package com.imooc.aspect;

import org.apache.http.HttpRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * 日志操作
 */
@Component
@Aspect
public class HttpAspect {

    private static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut(value = "execution(public * com.imooc.controller.GirlController.*(*))")
    public void point(){}
    @Before(value = "point()")
    public void log(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("url={}",request.getRequestURL());

        logger.info("method={}",request.getMethod());

        logger.info("ip={}",request.getRemoteAddr());

        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

        logger.info("args={}",joinPoint.getArgs());
    }
    @After(value = "point()")
    public void after(){
        logger.info("Afffter.......");
    }

    @AfterReturning(returning = "object",pointcut = "point()")
    public void doAfterReturning(Object object){
        logger.info("return={}",object.toString());

    }
}

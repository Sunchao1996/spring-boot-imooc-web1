package com.imooc.servlet;

import com.imooc.filter.HelloFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Sunc on 2018/1/17.
 */
@Configuration
public class ServletBeanConfiguration {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new HelloServlet(),"/hello1");
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        return new FilterRegistrationBean(new HelloFilter());
    }
}

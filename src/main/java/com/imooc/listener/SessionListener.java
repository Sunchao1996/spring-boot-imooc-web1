package com.imooc.listener;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener{
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}

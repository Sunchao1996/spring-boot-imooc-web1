package com.imooc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.annotation.ServletSecurity;

@SpringBootApplication
@ServletComponentScan
public class GrilApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrilApplication.class, args);
    }
}

package com.jianshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JianshuApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianshuApplication.class, args);
    }
}

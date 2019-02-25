package com.lee.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.lee.service",
        "com.lee.web.controller",
        "com.lee.web.config"})
@MapperScan("com.lee.dao")
@SpringBootApplication
public class LeeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeeWebApplication.class, args);
    }

}

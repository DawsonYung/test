package com.yangdsh.controller;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.yangdsh.mapper")
public class SpringController extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringController.class, args);
    }
}

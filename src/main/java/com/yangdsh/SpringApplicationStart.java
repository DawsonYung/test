package com.yangdsh;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot 启动入口
 */
@SpringBootApplication
@MapperScan("com.yangdsh.mapper")
public class SpringApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationStart.class, args);
    }
}






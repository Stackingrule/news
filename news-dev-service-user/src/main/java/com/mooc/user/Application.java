package com.mooc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.mooc.user.mapper")
@ComponentScan("com.mooc")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

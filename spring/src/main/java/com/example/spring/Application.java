package com.example.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
//@MapperScan("com.example.spring")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

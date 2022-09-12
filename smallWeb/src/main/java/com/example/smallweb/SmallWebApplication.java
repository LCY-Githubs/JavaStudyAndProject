package com.example.smallweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SmallWebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SmallWebApplication.class, args);
        System.out.println(111);
    }

}

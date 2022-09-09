package com.example.smallweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/user")
    public String hello(){
        return "hello jwt user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "hello jwt admin";
    }
}

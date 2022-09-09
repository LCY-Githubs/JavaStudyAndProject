package com.example.smallweb.controller;

import com.example.smallweb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        testService.test();
        return "Hello";
    }
}

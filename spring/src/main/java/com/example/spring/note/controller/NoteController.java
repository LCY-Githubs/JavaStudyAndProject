package com.example.spring.note.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {

    @GetMapping("/api/note")
    public String getNote(){
        return "sssss";
    }
}

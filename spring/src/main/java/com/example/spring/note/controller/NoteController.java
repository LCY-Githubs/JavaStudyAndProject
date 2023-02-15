package com.example.spring.note.controller;

import com.example.spring.note.dto.Note;
import com.example.spring.note.service.NoteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "便签功能接口组")
@RequestMapping("/api/note/")
public class NoteController {

    @Autowired
    NoteService noteService;
    @GetMapping("get")
    public String getNote(){
        return "sssss";
    }

    @ApiOperation(value = "便签功能组-新增")
    @PostMapping("add")
    public String addNote(@RequestBody Note note){
        return null;
    }
}

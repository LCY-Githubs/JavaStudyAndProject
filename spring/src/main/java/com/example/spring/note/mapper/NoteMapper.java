package com.example.spring.note.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.spring.note.dto.Note;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoteMapper extends BaseMapper<Note> {

}

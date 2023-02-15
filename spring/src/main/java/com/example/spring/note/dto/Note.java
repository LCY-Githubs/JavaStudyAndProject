package com.example.spring.note.dto;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@TableName("small_web_note")
public class Note {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String code;//便签编号
    private Integer status;//便签状态
    private String des;
    private String name;
    @TableField("`addTime`")
    private LocalDate addTime;//add the note time
    @TableField("`updateTime`")
    private LocalDate updateTime;
    @TableField("`setTime`")
    private LocalDate setTime;//设定时间，此时间为添加便签时设置的设定完结时间


}

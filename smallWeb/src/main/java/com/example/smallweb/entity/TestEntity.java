package com.example.smallweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test_entity")
public class TestEntity {

    @TableId(type = IdType.AUTO)
    public Integer id;

    public String name;
    public String code;

}

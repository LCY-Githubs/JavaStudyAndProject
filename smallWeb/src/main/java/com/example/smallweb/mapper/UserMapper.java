package com.example.smallweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.smallweb.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}

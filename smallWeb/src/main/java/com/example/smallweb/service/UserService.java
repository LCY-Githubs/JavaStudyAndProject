package com.example.smallweb.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.smallweb.entity.User;
import com.example.smallweb.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {


}

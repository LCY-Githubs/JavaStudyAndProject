package com.example.smallweb.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.smallweb.entity.TestEntity;
import com.example.smallweb.mapper.TestEntityMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService extends ServiceImpl<TestEntityMapper, TestEntity> {


    public void test() {
        List<TestEntity> entities = this.getBaseMapper().selectList(null);
        for (TestEntity entity : entities) {
            System.out.println(entity);
        }
    }
}

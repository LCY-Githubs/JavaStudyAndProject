package com.example.smallweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.smallweb.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestEntityMapper extends BaseMapper<TestEntity> {
}

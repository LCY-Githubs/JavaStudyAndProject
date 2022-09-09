package com.example.smallweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class OtherTest {

    @Autowired
    RedisTemplate redisTemplate;

    public void testRedis() {
        redisTemplate.opsForValue().set("user", "lcy");
        System.out.println(redisTemplate.opsForValue().get("user"));

    }
}

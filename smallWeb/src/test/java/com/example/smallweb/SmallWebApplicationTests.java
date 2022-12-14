package com.example.smallweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SmallWebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void testRedis() {
        redisTemplate.opsForValue().set("user", "lcy");
        System.out.println(redisTemplate.opsForValue().get("user"));

    }

}

package com.vwater.redis;

import com.vwater.redis.config.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    private RedisService redisService;

    @Test
    public void contextLoads() {
    }


    @Test
    public void setString(){
        redisService.set("my_first_key","my_first_value");
    }

    @Test
    public void getRedisService() {
        System.out.println(redisService.get("my_first_key"));
    }
}


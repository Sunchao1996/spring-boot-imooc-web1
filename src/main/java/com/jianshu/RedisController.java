package com.jianshu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sunc on 2018/1/13.
 */
@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/set/redis")
    public void set(){
        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();
        ops.set("test_redis","hello redis",1, TimeUnit.MINUTES);
    }
    @RequestMapping("/get/redis")
    public String get(){
        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();
        return ops.get("test_redis");
    }
}

package com.sd.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserNameRedisService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void saveUser(String username) {
        redisTemplate.
        redisTemplate.opsForValue().set(username, "value"+username);
    }

    public String getUser(String username) {
        return redisTemplate.opsForValue().get(username);
    }
}

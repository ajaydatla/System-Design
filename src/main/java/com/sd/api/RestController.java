package com.sd.api;

import com.sd.redis.UserNameRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController("/")
public class RestController {

    @Autowired
    UserNameRedisService userNameRedisService;


    @GetMapping("/")
    public String isWorking(){
        return "workihng";
    }

    @PostMapping("/username/{username}")
    public String postUsername(@PathVariable(name = "username") String username){
        System.out.println("user "+username);
        userNameRedisService.saveUser(username);
        return "success";
    }

    @GetMapping("/username/{username}")
    public String getUsername(@PathVariable(name = "username") String username){

        return userNameRedisService.getUser(username);
    }

    @PostMapping("/manyusername")
    public String manypostUsername(){
        return "success";
    }

}

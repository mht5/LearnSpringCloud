package com.mhts.springcloud.service;

import com.mhts.springcloud.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloServiceFallback implements HelloService {

    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello1(@RequestParam("name") String name) {
        return "error";
    }

    @Override
    public User hello2(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User("unknown", 0);
    }

    @Override
    public String hello3(@RequestBody User user) {
        return "error";
    }

}

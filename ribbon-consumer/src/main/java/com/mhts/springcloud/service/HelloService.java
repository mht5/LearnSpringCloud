package com.mhts.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String sayHello() {
        return restTemplate.getForObject("http://HELLO-SERVICE/hello", String.class);
    }

    public String helloFallback() {
        return "error";
    }
}

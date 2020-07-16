package com.mhts.springcloud.controller;

import com.mhts.springcloud.domain.User;
import com.mhts.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer1", method = RequestMethod.GET)
    public String helloConsumer1() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello1("mohan")).append("\n");
        sb.append(helloService.hello2("mohan", 20)).append("\n");
        sb.append(helloService.hello3(new User("mohan", 20))).append("\n");
        return sb.toString();
    }

}

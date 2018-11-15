package com.test.springcloud.serviceribbon.controller;

import com.test.springcloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComsumerController {
    @Autowired
    HelloService helloService;
    @GetMapping(value = "/comsumer")
    public String getName(@RequestParam(value = "name", defaultValue = "wjk") String name) {
        return  helloService.hiService(name);
    }
}

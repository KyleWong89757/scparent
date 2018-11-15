package com.test.springcloud.eurekaprovider02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.port}")
    String port;
    @GetMapping("/user/{id}")
    public String findOrderById(@PathVariable String id) {

        return  port+"你的名字是："+id;
    }
}

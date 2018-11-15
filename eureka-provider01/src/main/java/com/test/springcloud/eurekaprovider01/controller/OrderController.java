package com.test.springcloud.eurekaprovider01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/order")
    public String getOrder(@RequestParam(value = "name", defaultValue = "wjk") String name) {
        return port+"订单名称是：" + name;
    }
}

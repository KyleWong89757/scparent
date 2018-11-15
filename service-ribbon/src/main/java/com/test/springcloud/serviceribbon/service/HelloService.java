package com.test.springcloud.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
   @HystrixCommand(fallbackMethod = "hystrixError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://eurka-provider-order/order?name="+name,String.class);
    }
    public String hystrixError(String name){
        return "你好，" + name + "访问服务出错";
    }
}

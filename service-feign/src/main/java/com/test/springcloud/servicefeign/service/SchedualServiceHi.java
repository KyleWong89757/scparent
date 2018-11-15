package com.test.springcloud.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "eurka-provider-user", fallbackFactory = ErrorFallbackFactory.class)
@Service
public interface SchedualServiceHi {
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    String getUser(@RequestParam(value = "id") String id);
}

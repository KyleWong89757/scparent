package com.test.springcloud.servicefeign.controller;

import com.test.springcloud.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping(value = "/user")
    public String getUser(@RequestParam(value = "id",defaultValue = "ww") String id ){
        return schedualServiceHi.getUser(id);
    }
}

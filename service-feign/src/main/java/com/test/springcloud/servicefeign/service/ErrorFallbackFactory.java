package com.test.springcloud.servicefeign.service;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ErrorFallbackFactory implements FallbackFactory<SchedualServiceHi> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorFallbackFactory.class);

    @Override
    public SchedualServiceHi create(Throwable throwable) {
        return new SchedualServiceHi() {
            @Override
            public String getUser( String id) {
                //如果在create()中打印错误信息的话，在应用程序启动时就会打印
                ErrorFallbackFactory.LOGGER.info("fall back cause: ", throwable);
                return "Error!";
            }
        };
    }
}


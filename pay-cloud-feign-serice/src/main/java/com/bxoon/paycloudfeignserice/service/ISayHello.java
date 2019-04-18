package com.bxoon.paycloudfeignserice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "PAY-STAT-SERVER")

public interface ISayHello {
    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    String sayHello();
}

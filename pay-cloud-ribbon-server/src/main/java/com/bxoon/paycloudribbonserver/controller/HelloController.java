package com.bxoon.paycloudribbonserver.controller;

import com.bxoon.paycloudribbonserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(name = "/sayHello")
    @ResponseBody
    public String sayHello(){
        return helloService.hiService();
    }
}

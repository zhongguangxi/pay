package com.bxoon.paystatserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableDiscoveryClient
public class PayStatServerApplication {

    @Value("${server.port}")
    String port;

    @RequestMapping("/sayHi")
    @ResponseBody
    public String sayHi(){
        return "HI,I'm port:"+port;
    }


    public static void main(String[] args) {
        SpringApplication.run(PayStatServerApplication.class, args);
    }

}

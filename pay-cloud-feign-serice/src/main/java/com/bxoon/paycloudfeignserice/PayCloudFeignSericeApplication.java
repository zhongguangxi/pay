package com.bxoon.paycloudfeignserice;

import com.bxoon.paycloudfeignserice.service.ISayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableFeignClients
@Controller
public class PayCloudFeignSericeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayCloudFeignSericeApplication.class, args);
    }

    @Autowired
    ISayHello sayHello;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
       return sayHello.sayHello();
    }
}

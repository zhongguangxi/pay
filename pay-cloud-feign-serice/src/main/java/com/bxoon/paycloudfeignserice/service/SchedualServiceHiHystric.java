package com.bxoon.paycloudfeignserice.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements ISayHello {
    @Override
    public String sayHello() {
        return "sorry, you are fail";
    }
}

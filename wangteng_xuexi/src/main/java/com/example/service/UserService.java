package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    OrderService orderService;

    public void test(){
        System.out.println("test");
    }
}

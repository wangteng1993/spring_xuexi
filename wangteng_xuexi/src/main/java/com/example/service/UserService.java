package com.example.service;

import com.example.bean.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class UserService {

    @Autowired
    OrderService orderService;

    @Autowired
    private User admin;

   @PostConstruct
    public void a(){
//        mysql --->User对象--->admin
    }

    public void test(){
        System.out.println("test");
    }
}

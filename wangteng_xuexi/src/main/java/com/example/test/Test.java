package com.example.test;

import com.example.config.AppConfig;
import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Bean 对象
        //UserService.class -->无参构造方法--->对象-------->bean
        UserService userService = (UserService) context.getBean("userService");

        //new 对象区别 orderService 无值
        UserService userService1 = new UserService();

        userService.test();
    }
}

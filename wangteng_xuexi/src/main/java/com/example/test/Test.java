package com.example.test;

import com.example.config.AppConfig;
import com.example.service.UserService;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Bean 对象
        //    UserService.class -->无参构造方法--->对象--
        //    -->依赖注入( @Autowired 属性赋值)-->
        //    初始化前(调用a方法)---->初始化--->初始化后--->bean
        UserService userService = (UserService) context.getBean("userService");
        userService.getAdmin();



        //@Autowired实现
        for (Field field : userService.getClass().getFields()) {
            if (field.isAnnotationPresent(Autowired.class)){
//                field赋值
//                field.set(userService,);
            }
        }
        //  @PostConstruct 实现
        for (Method method : userService.getClass().getMethods()) {
            if (method.isAnnotationPresent(Constructor.class)){

            }
        }


        //new 对象区别 orderService 无值
        UserService userService1 = new UserService();

        userService.test();
    }
}

package com.zhukm.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by king on 2017/3/22.
 */
public class ConsumerServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        applicationContext.start();
        TestService testService = (TestService)applicationContext.getBean("testService");
        System.out.println(testService.sayHello());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

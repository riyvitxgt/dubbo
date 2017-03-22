package com.zhukm.dubbo.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by king on 2017/3/22.
 */
public class TestServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        applicationContext.start();
        System.out.println("provider服务已启动...");
        try {
            System.in.read();//服务要一直跑,才能持续提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
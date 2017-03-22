package com.zhukm.dubbo.service.impl;

import com.zhukm.dubbo.service.TestService;

/**
 * Created by king on 2017/3/22.
 */
public class TestServiceImpl implements TestService {
    public String sayHello() {
        return "HELLO!";
    }
}

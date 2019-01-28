package com.zykj.springboot_example.controller;

import com.zykj.springboot_example.service.AsyncTestService;
import com.zykj.springboot_example.service.AsyncTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *异步编程：1.在SpringbootExampleApplication类上加@EnableAsync注解，启动异步编程
 *          2.在异步方法上加@Async注解
 */
@RequestMapping("/AsyncTest")
@RestController
public class AsyncTestController {
    @Autowired
    AsyncTestService asyncTestService;


    @RequestMapping("/asyncTest")
    public String test1() {
        System.out.println("1");
        String str = asyncTestService.test1();
        System.out.println("4");
        return str;
    }
}

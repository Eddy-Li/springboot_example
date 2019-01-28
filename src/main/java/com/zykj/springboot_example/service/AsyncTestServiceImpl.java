package com.zykj.springboot_example.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/*
 *异步编程：1.在SpringbootExampleApplication类上加@EnableAsync注解，启动异步编程
 *          2.在异步方法上加@Async注解
 */
@Service
public class AsyncTestServiceImpl implements AsyncTestService {

    @Async
    public String test1() {
        System.out.println("2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3");
        return "async test";
    }
}

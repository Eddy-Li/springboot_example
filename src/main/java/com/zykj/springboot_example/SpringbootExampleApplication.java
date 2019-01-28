package com.zykj.springboot_example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Repository;

/*
 * SpringBootApplication注解=SpringBootConfiguration注解
 *                            +EnableAutoConfiguration注解
 *                            +ComponentScan注解扫描当前包、同级包以及同级包子包
 *
 * EnableAsync:启用异步编程
 *
 * MapperScan:mybatis配置Mapper
 */
@SpringBootApplication
@EnableAsync
@MapperScan(basePackages = "com.zykj.springboot_example.dao", annotationClass = Repository.class)
public class SpringbootExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootExampleApplication.class, args);

    }


}


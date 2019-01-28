package com.zykj.springboot_example.controller;

import com.zykj.springboot_example.service.MultiEnviromentTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在application.properties配置文件中：
 * <p>
 * #多环境配置,application-xxx.properties为固定格式，xxx为自定义名称
 * #dev：代表使用application-dev.properties配置文件；
 * #test:代表使用application-test.properties配置文件；
 * #prod:代表使用application-prod.properties配置文件；
 * spring.profiles.active=dev
 */
@RequestMapping("/MultiEnviromentTest")
@RestController
public class MultiEnviromentTestController {
    @Autowired
    MultiEnviromentTestService multiEnviromentTestService;

    @RequestMapping("/getJDBCUserName")
    public String getJDBCUserName() {
        return multiEnviromentTestService.getJDBCUserName();
    }

}

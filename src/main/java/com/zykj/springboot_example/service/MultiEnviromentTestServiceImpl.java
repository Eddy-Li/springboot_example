package com.zykj.springboot_example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MultiEnviromentTestServiceImpl implements MultiEnviromentTestService {
    @Value("${jdbc.database.username}")
    private String JDBCUserName;


    public String getJDBCUserName() {
        return JDBCUserName;
    }
}

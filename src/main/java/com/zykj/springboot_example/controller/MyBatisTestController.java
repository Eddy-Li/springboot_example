package com.zykj.springboot_example.controller;

import com.zykj.springboot_example.entity.Student;
import com.zykj.springboot_example.service.MyBatisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyBatisTest")
public class MyBatisTestController {
    @Autowired
    private MyBatisTestService myBatisTestService;


    @RequestMapping("/getStudentByStudentNumber")
    public Student getStudentByStudentNumber(@RequestParam("studentNumber") String studentNumber) {
        return myBatisTestService.getStudentByStudentNumber(studentNumber);
    }

}

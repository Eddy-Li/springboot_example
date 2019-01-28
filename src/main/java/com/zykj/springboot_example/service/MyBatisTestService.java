package com.zykj.springboot_example.service;

import com.zykj.springboot_example.entity.Student;

public interface MyBatisTestService {
    Student getStudentByStudentNumber(String studentNumber);
}

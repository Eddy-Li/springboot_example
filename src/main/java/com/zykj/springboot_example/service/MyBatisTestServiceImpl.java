package com.zykj.springboot_example.service;

import com.zykj.springboot_example.dao.StudentDao;
import com.zykj.springboot_example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/*
 * springboot默认集成了事务管理，只需要加 @Transactional即可，不需要其他配置
 * @Transactional:加此注解的方法不能有try
 *
 *
 */

@Service
public class MyBatisTestServiceImpl implements MyBatisTestService {
    @Autowired
    StudentDao studentDao;

    @Override
    @Transactional
    public Student getStudentByStudentNumber(String studentNumber) {
        return studentDao.getStudentByStudentNumber(studentNumber);
    }
}

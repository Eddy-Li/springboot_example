package com.zykj.springboot_example.dao;

import com.zykj.springboot_example.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDao {
    Student getStudentByStudentNumber(@Param("studentNumber") String studentNumber);
}

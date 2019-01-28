package com.zykj.springboot_example.error;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*
 *全局捕获异常：
 * 当controller的方法出现异常时，不能返回正确数据给用户，可以返回友好页面
 * 底层是AOP
 *
 */
//@ControllerAdvice(basePackages = "com.zykj.springboot_example.controller")
public class GlobalExceptionHandler {

//    @ExceptionHandler(RuntimeException.class)
//    public ModelAndView returnErrorResult() {
//        System.out.println("enter error handler...");
//        ModelAndView modelAndView = new ModelAndView("errorPage.html");
//        return modelAndView;
//    }

}

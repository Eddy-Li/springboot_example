package com.zykj.springboot_example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@SessionAttributes(names = {"userName", "passWord"})
@Controller
public class ThymeleafTestController {

    @RequestMapping("/thymeleafTest")
    public String test1(Model model) {
        model.addAttribute("name", "eddy");
        model.addAttribute("userName", "Candy");
        model.addAttribute("passWord", "123456");
        //spring.thymeleaf.prefix=classpath:/templates/,即templates/thymeleafTest.html
        return "thymeleafTest.html";
    }

}

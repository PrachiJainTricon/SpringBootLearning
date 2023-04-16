package com.springboot.emp.controller;

import com.springboot.emp.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/addemp")
    public String addEmployee(){
        return "add_emp";
    }

    @PostMapping("/register")
    public String registeremp(@ModelAttribute Employee e){
        System.out.println(e);
        return "add_emp";
    }
}

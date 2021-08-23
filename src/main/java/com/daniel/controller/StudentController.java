package com.daniel.controller;

import com.daniel.domain.Student;
import com.daniel.services.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    
    @Autowired
    StudentServiceImpl iStudentService;
    @RequestMapping("/test")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:63342/", maxAge = 3600)
    public List<Student> test(){
        ModelAndView mv = new ModelAndView();
        List<Student> allStudent = iStudentService.getAllStudent();
        return allStudent;
    }
    
}

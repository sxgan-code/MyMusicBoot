package com.daniel.controller;

import com.daniel.domain.Student;
import com.daniel.services.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    
    @Autowired
    StudentServiceImpl iStudentService;
    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        List<Student> allStudent = iStudentService.getAllStudent();
        mv.addObject("allStu", allStudent);
        mv.setViewName("all");
        return mv;
    }
    @RequestMapping("/testdata")
    @RequestBody
    public List testdata(){
        ModelAndView mv = new ModelAndView();
        List<Student> allStudent = iStudentService.getAllStudent();
        mv.addObject("allStu", allStudent);
        mv.setViewName("all");
        return allStudent;
    }
}

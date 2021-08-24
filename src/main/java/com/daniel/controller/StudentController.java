package com.daniel.controller;

import com.daniel.domain.ResultMap;
import com.daniel.domain.Student;
import com.daniel.services.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
    /**
     * 返回Student列表
     *
     * @return
     */
    @CrossOrigin
    @RequestMapping("/studentData")
    @ResponseBody
    public ResultMap<Student> getStuResult(){
        ResultMap<Student> studentResultMap = new ResultMap<>();
        studentResultMap.setCode("0");
        studentResultMap.setMsg("数据请求成功——返回Student信息");
        studentResultMap.setStatus("200");
        studentResultMap.setData(iStudentService.getAllStudent());
        return studentResultMap;
    }
}

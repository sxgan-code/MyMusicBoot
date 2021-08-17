package com.daniel.services.impl;

import com.daniel.domain.Student;
import com.daniel.mapper.IStudentMapper;
import com.daniel.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentMapper iStudentMapper;
    @Override
    public List<Student> getAllStudent() {
        return iStudentMapper.getAllStudent();
    }
}

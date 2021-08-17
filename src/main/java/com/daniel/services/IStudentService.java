package com.daniel.services;

import com.daniel.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IStudentService {
    public List<Student> getAllStudent();
}

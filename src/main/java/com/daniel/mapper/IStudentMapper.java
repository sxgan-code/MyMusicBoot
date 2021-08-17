package com.daniel.mapper;

import com.daniel.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IStudentMapper {
//    @Select("select * from student_info")
    public List<Student> getAllStudent();
}

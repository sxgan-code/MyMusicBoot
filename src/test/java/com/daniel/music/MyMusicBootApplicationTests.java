package com.daniel.music;

import com.daniel.mapper.IStudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyMusicBootApplicationTests {
    @Autowired
    IStudentMapper iStudentMapper;
    @Test
    void contextLoads() {
    }
    @Test
    void testCodeLibraryMapper(){
        System.out.println(iStudentMapper.getAllStudent().toString());
    }
    
}

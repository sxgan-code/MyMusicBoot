package com.daniel.domain;

public class Student {
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private Integer stuSex;
    
    public Student() {
    }
    
    public Integer getStuId() {
        return stuId;
    }
    
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }
    
    public String getStuName() {
        return stuName;
    }
    
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    
    public Integer getStuAge() {
        return stuAge;
    }
    
    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }
    
    public Integer getStuSex() {
        return stuSex;
    }
    
    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuSex=" + stuSex +
                '}';
    }
}

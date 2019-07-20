package it.study.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: ssm_student
 * @description:
 * @author: Mr.Li
 * @create: 2019-06-18 12:37
 **/
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String classStudent;
    private String classTeacher;

    //getter和setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classStudent='" + classStudent + '\'' +
                ", classTeacher='" + classTeacher + '\'' +
                '}';
    }
}

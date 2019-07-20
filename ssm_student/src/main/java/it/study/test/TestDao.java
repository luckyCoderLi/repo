package it.study.test;

import it.study.domain.Student;
import it.study.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program: ssm_student
 * @description:
 * @author: Mr.Li
 * @create: 2019-06-18 13:43
 **/
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TestDao {
    @Autowired
    private StudentService studentService;

    @Test
    public void findAll(){
        List<Student> students = studentService.findAll();
        for (Student student : students) {
            System.out.println("--------学生信息------");
            System.out.println(student);
        }
    }

    @Test
    public void findById(){
        Student student = studentService.findById(1);
        System.out.println(student);
    }

//    @Test
//    public void findByName(){
//        List<Student> students = studentService.findByName("刘");
//        for (Student student : students) {
//            System.out.println("-----模糊查询-----");
//            System.out.println(student);
//        }
//    }
    @Test
    public void addStudent(){
        Student student = new Student();
        student.setName("关刘");
        student.setAge(18);
        student.setClassStudent("三年级1班");
        student.setClassTeacher("刘邦");
        studentService.addStudent(student);
    }

    @Test
    public void deleteStudentById(){
        studentService.deleteStudentById(4);
    }

    @Test
    public void updateStudent(){
        Student student = studentService.findById(3);
        student.setName("张飞");
        student.setAge(19);
        student.setClassStudent("三年级1班");
        student.setClassTeacher("刘邦");
        studentService.updateStudent(student);
    }
}

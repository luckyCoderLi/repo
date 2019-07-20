package it.study.service.impl;

import it.study.dao.StudentDao;
import it.study.domain.Student;
import it.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm_student
 * @description:
 * @author: Mr.Li
 * @create: 2019-06-18 12:40
 **/
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return studentDao.findById(id);
    }



    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentDao.deleteStudentById(id);
    }
}

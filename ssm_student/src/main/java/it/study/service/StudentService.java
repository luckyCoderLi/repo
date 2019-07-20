package it.study.service;

import it.study.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Integer id);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudentById(Integer id);
}

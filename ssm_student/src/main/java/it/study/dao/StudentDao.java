package it.study.dao;

import it.study.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentDao {

    @Select("select * from student")
    @Results(id = "student",value = {
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),
            @Result(column = "class_student",property = "classStudent"),
            @Result(column = "class_teacher",property = "classTeacher"),
    })
    List<Student> findAll();

    @Select("select * from student where id=#{id}")
    @ResultMap("student")
    Student findById(Integer id);

//    @Select("select * from student where like #{name}")
//    @ResultMap("student")
//    List<Student> findByName(String name);

    @Insert("INSERT student(name,age,class_student,class_teacher)\n" +
            "VALUES(#{name},#{age},#{classStudent},#{classTeacher})")
    void addStudent(Student student);

    @Update("update student set name=#{name},age=#{age},class_student=#{classStudent},class_teacher=#{classTeacher} where id=#{id}")
    @ResultMap("student")
    void updateStudent(Student student);

    @Delete("delete from student where id=#{id}")
    void deleteStudentById(Integer id);
}

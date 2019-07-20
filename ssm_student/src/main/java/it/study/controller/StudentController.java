package it.study.controller;

import it.study.domain.Student;
import it.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @program: ssm_student
 * @description:
 * @author: Mr.Li
 * @create: 2019-06-18 12:42
 **/
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //测试spring是否能独立运行
    @RequestMapping("/test")
    public String test() {
        System.out.println("测试成功....");
        return "student";
    }

    /**
     * 查找所有
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("-----所有学生信息----");
        //调用service方法
        List<Student> students = studentService.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
        model.addAttribute("students",students);
        return "findAll";
    }

    /**
     * 查找一个
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public String findById(Model model,Integer id) {
        System.out.println("-----一个学生信息----");
        //调用service方法
        Student student = studentService.findById(id);
        System.out.println(student);
        model.addAttribute(student);
        return "student";
    }

    /**
     * 添加学生
     * @param model
     * @param student
     * @return
     */
    @RequestMapping("/addStudent")
    public String addStudent(Model model,Student student) {
        System.out.println("-----添加学生信息----");
        //调用service方法
        studentService.addStudent(student);
        model.addAttribute(student);
        return "forward:/student/findAll";
    }

    /**
     * 在执行信息更新前先查询用户完整信息，当只更新部分内容时，其它用户信息自动补全
     * @param id
     * @param map
     */
    @ModelAttribute
    public void showStudent(Integer id,Map<String, Student> map){
        System.out.println("------我是原始信息呢----");
        Student student = studentService.findById(id);
        System.out.println(student);
        map.put("stu",student);
    }
    @RequestMapping("/updateStudent")
    public String updateStudent(Model model,@ModelAttribute(name = "stu")Student student){
        //更新数据库个人信息
        studentService.updateStudent(student);
        model.addAttribute(student);
        System.out.println("更新后的学生信息");
        System.out.println(student);
        return "student";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/deleteStudent")
    public String deleteStudent(Integer id){
        studentService.deleteStudentById(id);
        return "forward:/student/findAll";
    }
}



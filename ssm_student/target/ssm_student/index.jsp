<%--
  Created by IntelliJ IDEA.
  User: 31954
  Date: 2019/6/18
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="student/test" >测试</a><br/><br/>
    <a href="student/findAll" >查询所有</a><br/><br/>

    <a>查询一个</a>
    <form action="student/findById" method="post">
        ID查询:<input type="number" name="id"><br/>
        姓名查询:<input type="text" name="name"><br/>
        <input type="submit" value="提交">
    </form><br/><br/>

    <a>添加学生</a>
    <form action="student/addStudent" method="post">
        姓名:<<input type="text" name="name">
        年龄:<<input type="text" name="age">
        班级:<<input type="text" name="classStudent">
        班主任:<<input type="text" name="classTeacher">
        <input type="submit" value="提交">
    </form><br/><br/>

    <a>更新信息</a>
    <form action="student/updateStudent" method="post">
        ID:<input type="number" name="id"><br/>
        姓名:<input type="text" name="name"><br/>
        年龄:<input type="text" name="age"><br/>
        班级:<input type="text" name="classStudent"><br/>
        班主任:<input type="text" name="classTeacher"><br/>
        <input type="submit" value="提交">
    </form><br/><br/>

    <a>删除一个</a>
    <form action="student/deleteStudent" method="post">
        ID:<input type="number" name="id"><br/>
        姓名:<input type="text" name="name"><br/>
        <input type="submit" value="提交">
    </form><br/><br/>

</body>
</html>

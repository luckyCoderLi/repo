<%--
  Created by IntelliJ IDEA.
  User: 31954
  Date: 2019/6/18
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
    <h3>所有学生信息</h3>
    <table border="1" width="300px">
        <tr bgcolor="yellow">
            <th>id</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>班级</th>
            <th>班主任</th>
        </tr>
        <c:forEach items="${students}" var="student" varStatus="s">
            <c:if test="${s.count % 2 != 0}">
                <tr bgcolor="aqua">
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                    <td>${student.classStudent}</td>
                    <td>${student.classTeacher}</td>
                </tr>
            </c:if>
            <c:if test="${s.count % 2 == 0}">
                <tr bgcolor="red">
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                    <td>${student.classStudent}</td>
                    <td>${student.classTeacher}</td>
                </tr>
            </c:if>
        </c:forEach>
    </table>
</body>
</html>

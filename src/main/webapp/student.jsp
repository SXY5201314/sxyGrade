<%--
  Created by IntelliJ IDEA.
  User: 程超
  Date: 2019/6/13
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>所有学生</h1>
<table border="1">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>地址</td>
        <td>邮箱</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.sid}</td>
            <td>${s.sname}</td>
            <td>${s.sgender}</td>
            <td>${s.sage}</td>
            <td>${s.saddress}</td>
            <td>${s.semail}</td>
            <td><a href="">删除</a>
                <a href="">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 程超
  Date: 2019/6/12
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <table>
      <tr>
          <th>编号</th>
          <th>姓名</th>
          <th>操作</th>
      </tr>
        <c:forEach items="${gradeList}" var="g">
            <tr>
                <td>${g.gid}</td>
                <td>${g.gname}</td>
                <td><a href="/delGrade?gid=${g.gid}">删除</a> |
                    <a href="/getGrade?gid=${g.gid}">修改</a></td>
                <td><a href="/showStudent?gid=${g.gid}">查看学生</a> |
                </td>
            </tr>
        </c:forEach>
  </table>
<h2><a href="add.jsp">添加</a> </h2>
</body>
</html>

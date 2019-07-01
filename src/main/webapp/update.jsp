<%--
  Created by IntelliJ IDEA.
  User: 程超
  Date: 2019/6/13
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
修改年级
<form method="post" name="s" action="updateGrade">
    年级名称：<input type="text" name="gname" value="${grade.gname}"><br>
    <input type="hidden" name="gid" value="${grade.gid}">
    <input type="submit" name="ss" value="修改">
</form>
</body>
</html>

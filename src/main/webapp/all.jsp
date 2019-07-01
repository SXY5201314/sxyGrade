<%--
  Created by IntelliJ IDEA.
  User: 程超
  Date: 2019/6/14
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<script language="javascript" src="js/jquery-1.8.3.min.js"></script>
<script language="JavaScript">
    $(function () {
        //$("#but1").click(function(){
        $.post("getData",null,function (data) {
            //将数据显示到网页里
            var table="<table border=1>";
            table=table+"<td>学号</td><td>姓名</td>";
            for (var i=0;i<data.length;i++){
                var s=data[i];
                table=table+"<td>s.gid</td><td>s.gname</td>";
            }
            table=table+"</table>";
            //显示
            $("#div1").html(table);
        },"json")
        
       //  });
    });

</script>
    <title>Title</title>
</head>
<body>
<input type="button" value="显示所有班级" id="but1">
<div id="#div1"></div>
</body>
</html>

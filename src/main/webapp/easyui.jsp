<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>json</title>
    <link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="easyUI/css/demo.css">
    <script src="js/jquery-1.8.3.min.js" language="javascript"></script>
    <script src="js/jquery.easyui.min.js"></script>
    <script>
    function oo() {
    $('#dd').dialog({
    title: 'My Dialog',
    width: 400,
    height: 200,
    closed: false,
    cache: false,
    href: 'add.jsp',
    modal: true
    });
    }</script>
    <!--jquery.easyui.min.js包含了easyUI中的所有插件-->
    <script src="js/jquery.easyui.min.js"></script>

</head>
<body>
<input type="button"  value="easyui" onclick="ui()">
<table id="dg"></table>

<input type="button"  value="OK啊" onclick="oo()">
<div id="dd">Dialog Content.</div>
</body>
</html>

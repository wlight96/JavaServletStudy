<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 11.
  Time: 오후 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String imgName = request.getParameter("imgName");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>spain img</title>
</head>
<body>
    <br><br>
    <h1> 이름은 <%=name%>입니다. </h1><br><br>
    <img src="./img/<%= imgName%>>"/>
</body>
</html>

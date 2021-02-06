<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 6.
  Time: 오후 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>결과출력창</title>
</head>
<body>
    <h1>결과 출력</h1>
<%
    request.setCharacterEncoding("utf-8");
    String user_id = request.getParameter("user_id");
    String user_pw = request.getParameter("user_pw");
%>
    <h1>아이디 : <%= user_id%> </h1>
    <h1>비밀번호 : <%= user_pw%> </h1>
</body>
</html>

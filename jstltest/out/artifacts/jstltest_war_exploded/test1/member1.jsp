<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 14.
  Time: 오전 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
%>

<html>
<head>
    <meta charset="UTF-8">
    <title>회원정보 출력 창</title>
</head>
<body>
    <table border="1" align="center">
        <tr align="center" bgcolor="#99ccff">
            <td width="20%"><b> id </b></td>
            <td width="20%"><b> pw </b></td>
            <td width="20%"><b> name </b></td>
            <td width="20%"><b> email </b></td>
        </tr>
        <tr align="center">
            <td><%=id %></td>
            <td><%=pwd %></td>
            <td><%=name %></td>
            <td><%=email %></td>
        </tr>
        <tr align="center">
            <td>${param.id}</td>
            <td>${param.pwd}</td>
            <td>${param.name}</td>
            <td>${param.email}</td>
        </tr>
    </table>
</body>
</html>

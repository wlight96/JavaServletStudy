<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 14.
  Time: 오전 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="m" class="jstlbean.MemberBean"/>
<jsp:setProperty name="m" property="*"/>
<meta charset="UTF-8">
<html>
<head>
    <title>회원정보 Bean에 저장 후 출력</title>
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
        <td><%=m.getId() %></td>
        <td><%=m.getPwd() %></td>
        <td><%=m.getName() %></td>
        <td><%=m.getEmail() %></td>
    </tr>
    <tr align="center">
        <td>${m.id}</td>
        <td>${m.pwd}</td>
        <td>${m.name}</td>
        <td>${m.email}</td>
    </tr>
</table>
</body>
</html>

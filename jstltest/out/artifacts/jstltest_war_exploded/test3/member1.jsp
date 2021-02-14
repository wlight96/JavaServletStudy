<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 14.
  Time: 오전 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<c:set var="id" value="hong" scope="page"/>
<c:set var="pwd" value="hong1234" scope="page"/>
<c:set var="name" value="${'홍길동'}" scope="page"/>
<c:set var="age" value="${33}" scope="page"/>
<c:set var="height" value="${177}" scope="page"/>

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
            <td width="20%"><b> 나이 </b></td>
            <td width="20%"><b> 키 </b></td>
        </tr>
        <tr align="center">
            <td>${id}</td>
            <td>${pwd}</td>
            <td>${name}</td>
            <td>${age}</td>
            <td>${height}</td>
        </tr>
    </table>
</body>
</html>

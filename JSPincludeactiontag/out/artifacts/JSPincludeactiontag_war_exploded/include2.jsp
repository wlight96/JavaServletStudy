<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 11.
  Time: 오후 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>include2.jsp</title>
</head>
<body>
    include2 이다!
<br>
<jsp:include page="spain_img.jsp" flush="true">
    <jsp:param name="name" value="스페인 오도바"/>이
    <jsp:param name="imgName" value="spain.png"/>
</jsp:include>
<br>
내용 출력후 끊기.
</body>
</html>

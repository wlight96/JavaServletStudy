<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 14.
  Time: 오전 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>login창</title>
</head>
<body>

<form action="result.jsp" method="post">
    아이디 : <input type="text" name="user_id">
    비밀번호 : <input type="password" name="user_pw">
    <input type="submit" value="로그인">
    <input type="reset" value="return">
</form>
<br><br>
<!--<a href = "http://localhost:8080/jstltest/memberForm.jsp">회원가입하기</a>-->
<%--<a href = "<%=request.getContextPath()%>jstltest/memberForm.jsp">회원가입하기</a>--%>
<a href="${pageContext.request.contextPath}/test1/memberForm.jsprm.jsp">회원가입하</a>
</body>
</html>

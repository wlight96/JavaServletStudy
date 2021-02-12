<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 12.
  Time: 오후 1:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>login창</title>
</head>
<body>
    <%
        String msg = request.getParameter("msg");
        if(msg != null){
    %>
    <h1> <%=msg %></h1>
    <%}%>
    <form action="result.jsp" method="post">
        아이디 : <input type="text" name="user_id">
        비밀번호 : <input type="password" name="user_pw">
        <input type="submit" value="로그인">
        <input type="reset" value="return">
    </form>
</body>
</html>

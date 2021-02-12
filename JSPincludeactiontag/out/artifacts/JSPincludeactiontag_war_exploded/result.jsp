<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 12.
  Time: 오후 1:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%request.setCharacterEncoding("utf-8");%>
<%!
    String msg = "아이디를 입력하지 않았습니다. 다시 입력해 주세요!";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>결과창</title>
</head>
<body>
    <%
        String user_id = request.getParameter("user_id");
        if(user_id.length()==0){
    %>
        <jsp:forward page="login.jsp" >
            <jsp:param name="msg" value="<%= msg %>"/>
        </jsp:forward>
    <%
        }
    %>
    <h1>환영합니다. <%=user_id%> 님!</h1>
</body>
</html>

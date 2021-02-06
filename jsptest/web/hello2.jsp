<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 4.
  Time: 오후 6:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" import="java.util.*" language="java"
session="true" buffer="8kb" autoFlush="true" isThreadSafe="true" info="(BbakBak2.........)"
isErrorPage="false" errorPage="" %>
<%!
    String name = "빡빡이";
    public String getName(){
        return name;
    }
%>
<% String age = request.getParameter("age"); %>
<html>
<head>
    <title>페이지 디렉티브 연습</title>
</head>
<body>
<h1>나는 <%=name %> 입니다!</h1><br>
<%@include file="bakbak_img.jsp"%><br>
<h1>빡빡이 아저씌야! <%= age %>살 입니다!</h1>
<h1> 10년 후에는 <%=Integer.parseInt(age)+10 %> 살 입니다.</h1>
</body>
</html>

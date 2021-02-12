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
    <title>include1.jsp</title>
</head>
<body>
    스페인 여행사진 입니다! 왜 오토바이인지 모르겠네
    <br>
    <jsp:include page="spain_img.jsp" flush="true">
        <jsp:param name="name" value="스페인"/>
        <jsp:param name="imgName" value="spain.png"/>
    </jsp:include>
    <br>
    내용 출력후 끊기.
</body>
</html>

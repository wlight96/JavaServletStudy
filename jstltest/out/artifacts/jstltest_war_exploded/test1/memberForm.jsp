<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 14.
  Time: 오전 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>회원 가입창</title>
</head>
<body>
<form method="post" action="member3.jsp">
    <h1 style="text-align: center">회원 가입을 해주세요!</h1>
    <table align="center">
        <tr>
            <td width="200">
                <p align="right">아이디
            </td>
            <td width="400">
                <input type="text" name="id">
            </td>
        </tr>
        <tr>
            <td width="200">
                <p align="right">비밀번호
            </td>
            <td width="400">
                <input type="password" name="pwd">
            </td>
            ㅡ            </tr>
        <tr>
            <td width="200">
                <p align="right">이름
            </td>
            <td width="400">
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td width="200">
                <p align="right">이메일
            </td>
            <td width="400">
                <input type="text" name="email">
            </td>
        </tr>
        <tr>
            <td width="200"><p>&nbsp;</p></td>
            <td width="400">
                <input type="submit" value="가입하기">
                <input type="reset" value="다시입력">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
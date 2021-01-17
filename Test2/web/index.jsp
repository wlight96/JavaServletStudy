<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 1. 11.
  Time: 오후 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset ="UTF-8">
    <script type = "text/javascript">
      function fn_validate(){
        var frmLogin = document.frmLogin;
        var user_id = frmLogin.user_id.value;
        var user_pw = frmLogin.user_pw.value;
        if((user_id.length==0||user_id == "")||(user_pw.length==0||user_pw=="")){
          alert("아이디와 비밀번호입력은 필수 입니다.");
        }else{
          frmLogin.method = "post";
          frmLogin.action = "Test2";
          frmLogin.submit();
        }
      }
    </script>
    <title>Login</title>
  </head>
  <body>
  <form name = "frmLogin" method="post" action="Test2" encType="UTF-8">
    ID :<input type="text" name="user_id"><br>
    P/W :<input type="password" name="user_pw"><br>
    <input type="button" onclick="fn_validate()" value="login">
    <input type="reset" value="다시입력">
    <input type="hidden" name="user_address" value="서울시 중구"/>
  </form>
  </body>
</html>

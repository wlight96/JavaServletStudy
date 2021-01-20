<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 1. 16.
  Time: 오후 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>회원 가입</title>
    <script type="text/javascript">
      function fn_senMember(){
        var frmMember = document.frmMember;
        var id = frmMember.id.value;
        var pwd = frmMember.pwd.value;
        var name = frmMember.name.value;
        var email = frmMember.email.value;
        if(id.length == 0 || id ==""){
          alert("아이디 입력은 필수입니다.");
        } else if(pwd.length == 0 || pwd ==""){
          alert("please input you're password");
        } else if(name.length == 0 || name ==""){
          alert("이름 입력은 필수입니다.");
        } else if(email.length == 0 || email =""){
          alert("e-mail 입력은 필수 입니다.");
        }else {
          frmMember.method ="post";
          frmMember.action = "member3";
          frmMember.submit();
        }
      }
    </script>
  </head>
  <body>
  <form name="frmMember">
    <table>
      <th>회원 가입</th>
      <tr><td>아이디</td>
        <td><input type="text" name="id"></td>
      </tr>
      <tr><td>비밀번호</td>
        <td><input type="text" name="pwd"></td>
      </tr>
      <tr><td>이름</td>
        <td><input type="text" name="name"></td>
      </tr>
      <tr><td>e-mail</td>
        <td><input type="text" name="email"></td>
      </tr>
    </table>
    <input type="button" value="가입하기" onclick="fn_senMember()">
    <input type="reset" value="다시입력">
    <input type="hidden" name="command" value="addMember">
  </form>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: saehee
  Date: 21. 2. 12.
  Time: 오후 6:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    import="java.util.*,memberdb.*" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="m" class="memberdb.MemberBean" scope="page" />
<%
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    m.setId(id);
    m.setPwd(pwd);
    m.setName(name);
    m.setEmail(email);
    MemberDAO memberDAO = new MemberDAO();
    memberDAO.addMember(m);
    List memberList = memberDAO.listMembers();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 정보</title>
</head>
<body>
    <table align="center" width="100%">
        <tr align="center" bgcolor="#6495ed">
            <td width="7%">아이디</td>
            <td width="7%">비밀번호</td>
            <td width="5%">이름</td>
            <td width="11%">email</td>
            <td width="5%">가입일</td>
        </tr>
    <% if(memberList.size()==0){
    %>
        <tr>
            <td colspan="5">
                <p align="center"><b><span style="font-size: 9pt;">
                    등록된 회원이 없습니다.</span></b></p>
            </td>
        </tr>
        <%
            }else{
                for(int i =0; i<memberList.size(); i++){
                    MemberBean bean = (MemberBean) memberList.get(i);
        %>
        <tr align="center">
            <td>
                <%= bean.getId()%>
            </td>
            <td>
                <%= bean.getPwd()%>
            </td>
            <td>
                <%= bean.getName()%>
            </td>
            <td>
                <%= bean.getEmail()%>
            </td>
            <td>
                <%= bean.getJoinDate()%>
            </td>
        </tr>
        <%
                }
            }
        %>
        <tr height="1" bgcolor="aqua">
            <td colspan="5"></td>
        </tr>
    </table>
</body>
</html>

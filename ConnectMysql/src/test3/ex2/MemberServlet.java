package test3.ex2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;


@WebServlet("/member3")
public class MemberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
        doHandle(requset,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doHandle(req,resp);
    }

    private void doHandle(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException{
        requset.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf8");
        MemberDAO dao = new MemberDAO();
        PrintWriter out = response.getWriter();
        String command = requset.getParameter("command");
        if(command != null && command.equals("addMember")){
            String _id = requset.getParameter("id");
            String _pwd = requset.getParameter("pwd");
            String _name = requset.getParameter("name");
            String _email = requset.getParameter("email");
            MemberVO vo = new MemberVO();
            vo.setId(_id);
            vo.setPwd(_pwd);
            vo.setName(_name);
            vo.setEmail(_email);
            dao.addMember(vo);
        }else if(command != null && command.equals("delMember")){
            System.out.println("삭제 하자!");
            String id = requset.getParameter("id");
            System.out.println(id);
            dao.delMember(id);
        }
        List<MemberVO> list = dao.listMembers();
        out.print("<html><body>");
        out.print("<table border=1><tr align='center' bgcolor = 'lightgreen'");
        out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td>" +
                "<td>삭제</td></tr>");
        for(int i =0; i < list.size();i++){
            MemberVO memberVO = (MemberVO) list.get(i);
            String id = memberVO.getId();
            String pwd = memberVO.getPwd();
            String name = memberVO.getName();
            String email = memberVO.getEmail();
            Date joinDate = memberVO.getJoinDate();
            out.print("<tr><td>" + id +"</td><td>"+ pwd +"</td><td>"
                    + name +"</td><td>" + email +"</td><td>" + joinDate +"</td><td>" +
                    "<a href='/servletstudy/member3?command=delMember&id=" + id + "'> 삭제 </a></td></tr>");
        }out.print("</table></body></html>");
        out.print("<a href='/servletstudy/memberForm.html'> 새 회원 등록하기</a>");
    }
}
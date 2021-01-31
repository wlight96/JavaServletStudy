package loginsessionconnectmysql;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/loginmysql")
public class LoginServlet extends HttpServlet {
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
        PrintWriter out = response.getWriter();
        String user_id  = requset.getParameter("user_id");
        String user_pw = requset.getParameter("user_pwd");
        MemberVO memberVO = new MemberVO();
        memberVO.setId(user_id);
        memberVO.setPwd(user_pw);
        MemberDAO dao = new MemberDAO();
        boolean result = dao.isExisted(memberVO);
        if(result){
            HttpSession session = requset.getSession();
            session.setAttribute("isLogon",true);
            session.setAttribute("login.id",user_id);
            session.setAttribute("login.pwd",user_pw);
            out.println("<html><body>");
            out.print("안녕하세요 " + user_id +"님!<br>");
            out.print("<a href='show'>회원정보 보기</a>");
            out.println("</body></html>");
        }else {
            out.print("<html><body><center>회원 아이디가 틀립니다.");
            out.print("<a href='login.html'>try login again</a>");
            out.print("</body></html>");
        }
    }
}

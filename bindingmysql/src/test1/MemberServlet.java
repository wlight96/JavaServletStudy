package test1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/member")
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
        List memberList = dao.listMembers();
        requset.setAttribute("membersList",memberList);
        RequestDispatcher dispatch = requset.getRequestDispatcher("viewMembers");
        dispatch.forward(requset,response);
    }
}
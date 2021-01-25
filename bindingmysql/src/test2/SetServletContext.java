package test2;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cset")
public class SetServletContext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset =utf-8");
        PrintWriter out = resp.getWriter();
        ServletContext context = getServletContext();
        List member = new ArrayList();
        member.add("이순신");
        member.add(30);
        context.setAttribute("member",member);
        out.println("<html><body>");
        out.println("이순신 30 설정");
        out.println("</body></html>");
    }
}

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

@WebServlet("/cget")
public class GetServletContext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset = utf-8");
        PrintWriter out = resp.getWriter();
        ServletContext context = getServletContext();
        List member = (ArrayList)context.getAttribute("member");
        String name = (String)member.get(0);
        int age = (Integer) member.get(1);
        out.println("<html><body>");
        out.println(name + "<br>");
        out.println(age + "<br>");
        out.println("</body></html>");
    }
}

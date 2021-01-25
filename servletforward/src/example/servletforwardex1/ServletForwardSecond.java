package example.servletforwardex1;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class ServletForwardSecond extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html'charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("refresh를 통한 redrect 실습");
        out.println("</body></html>");
    }
}

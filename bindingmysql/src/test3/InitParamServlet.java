package test3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InitParamServlet",
            urlPatterns = {"/sInit","/sInit2"},
            initParams = {@WebInitParam(name = "email", value = "wlight96@naver.com"),
                            @WebInitParam(name = "tel",value = "010-1111-2345")}
                            )

public class InitParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset = utf-8");
        PrintWriter out = resp.getWriter();
        String email = getInitParameter("email");
        String tel = getInitParameter("tel");
        out.println("<html><body>");
        out.println("<table><tr>");
        out.println("<td>email: </td><td>" + email + "</td></tr>");
        out.println("<tr><td> 휴대전화 : "+ tel + "</td></tr></table></body></html>");
    }
}

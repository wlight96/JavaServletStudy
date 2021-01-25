package example.servletbindingex1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstbinding")
public class FirstServletBinding extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset = utf-8");
        req.setAttribute("address","서울시 성북구");
        RequestDispatcher dispatch = req.getRequestDispatcher("secondbinding");
        dispatch.forward(req,resp);
    }
}

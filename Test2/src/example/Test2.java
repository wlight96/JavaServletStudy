package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Test2")
public class Test2 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("앙기모띠");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        String id = req.getParameter("user_id");
        String pw = req.getParameter("user_pw");
        String address = req.getParameter("user_address");
        System.out.println("id : " + id);
        System.out.println("pw : " + pw);

        String data = "<html>";
        data +="<body>";
        data +="ID : " +id ;
        data += "<br>";
        data +="P/w : " + pw;
        data += "<br>";
        data += "address" + address;
        data += "<br>";
        data += "</body>";
        data += "</html>";
        out.print(data);
    }
    @Override
    public void destroy() {

    }
}

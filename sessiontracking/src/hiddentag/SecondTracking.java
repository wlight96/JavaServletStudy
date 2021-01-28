package hiddentag;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondTracking extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init on second");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset = utf-8");
        PrintWriter out  = resp.getWriter();
        String user_id = req.getParameter("user_id");
        String user_pw = req.getParameter("user_pw");
        String user_address = req.getParameter("user_address");

        out.println("<html><body>");
        System.out.println(user_id);
        if(user_id != null && user_id.length() !=0){
            out.println("already login now");
            out.println("Hidden Tag servlet user id : " + user_id + "<br>");
            out.println("Hidden Tag servlet user pw : " + user_pw + "<br>");
            out.println("Hidden Tag servlet user address : " + user_address + "<br>");
            out.println("</body></html>");
        }else{
            out.println("로그인 되어있지 않습니다.");
            out.println("다시 로그인 하시기 바랍니다.<br><br>");
            out.println("<a href= '/sessiontracking/login.html'> 로그인 창으로 이동하기 </a>");
        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}

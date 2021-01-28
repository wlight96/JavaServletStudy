package hiddentag;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

@WebServlet("/login")
public class HiddenTagTracking extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init method 호출");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset = utf-8");
        PrintWriter out = resp.getWriter();
        String user_id = req.getParameter("user_id");
        String user_pw = req.getParameter("user_pw");
        String user_address = req.getParameter("user_address");
        String user_email = req.getParameter("user_email");
        String user_hp = req.getParameter("user_hp");

        String data = "안녕하세요!<br>로그인 하셨습니다.<br><br>";
        data += "<html><body>";
        data += "아 이 디 : " + user_id+ "<br>";
        data += "비밀번호 : " + user_pw+ "<br>";
        data += "주  소 : " + user_address+ "<br>";
        data += "email : " + user_email+ "<br>";
        data += "h p : " + user_hp+ "<br>";
        data += "<br>";
        out.print(data);

        user_address = URLEncoder.encode(user_address,"utf-8");
        out.print("<a href= '/sessiontracking/second?user_id=" + user_id + "&user_pw=" +user_pw +
                "&user_address=" +user_address+"'> 두번째 서블릿으로 보내기 </a>");
        data ="</body></html>";
        out.println(data);
    }

    @Override
    public void destroy() {
        System.out.println("destroy 메서드 호출");
    }
}

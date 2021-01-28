package cookiesession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

@WebServlet("/set")
public class SetCookieValue extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        Date d = new Date();
        Cookie c = new Cookie("CookieTest", URLEncoder.encode("JSP프로그래밍 입니다.","utf-8"));
        // cookie 객체 생성 및 한글정보 인코딩 후(cookie test 란 이름) 저장
        c.setMaxAge(24*60*60); // 유효기간 설정
        resp.addCookie(c); // 생성된 쿠키 브라우저에 전송
        out.println("현재 시간 :" + d);
        out.println("문자열을 cookie에 저장합니다.");
    }
}

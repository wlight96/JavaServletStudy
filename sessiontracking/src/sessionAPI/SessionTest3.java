package sessionAPI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/sess3")
public class SessionTest3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        out.println("세션 아이디 : " + session.getId() + "<br>");
        out.println("최초의 세션 생성 시각 : "+new Date(session.getCreationTime())+"<br>");
        out.println("최근 세션 접근 시각 : "+ new Date(session.getLastAccessedTime())+ "<br>");
        out.println("세션 유효시간 : "+session.getMaxInactiveInterval()+"<br>");
        if(session.isNew()){
            out.println("새 세션이 만들어 졌습니다.");
        }session.invalidate();
    }
}

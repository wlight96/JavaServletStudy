package cookiesession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

@WebServlet("/get")
public class GetCookieValue extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter out = resp.getWriter();
        Cookie[] allValues = req.getCookies();
        for(int i = 0; i< allValues.length; i++){
            if(allValues[i].getName().equals("CookieTest")){
                out.println("<h2>get Cookie values : " + URLDecoder.decode(allValues[i].getValue(),"utf-8"));
            }
        }
    }
}

package char18;

import tool.Page;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/char18/count"})
public class Count extends HttpServlet {

    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        PrintWriter out = response.getWriter();
        
        Page.cssheader(out);
        
        Cookie[] cookies = request.getCookies();
        
        Integer count = null;
        if (cookies != null) {
            for (Cookie ck : cookies) {
                if (ck.getName().equals("count")) {
                    count = Integer.valueOf(ck.getValue());
                    break;
                }
            }
        }
        if (count == null) {
            count = 0;
        }
        count ++;
        
        Cookie cookie = new Cookie("count", count.toString());
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);

        out.println(count);

        Page.cssfooter(out);
    }

}

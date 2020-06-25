package char18;

import tool.Page;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/char18/get"})
public class Get extends HttpServlet {

    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        PrintWriter out = response.getWriter();

        Page.cssheader(out);
        
        Cookie[] cookies = request.getCookies();
        
        if (cookies != null) {
            for (Cookie c : cookies) {
                String name = c.getName();
                String value = c.getValue();
                out.println("<p>" + name + " : " + value + "</p>");
            }
        } else {
            out.println("クッキーは存在しません");
        }

        Page.cssfooter(out);
    }

}

package char19;

import tool.Page;
import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;

public class ParamServlet extends HttpServlet {
    
    private String message;
    
    public void init() throws ServletException {
        ServletConfig config = getServletConfig();
        message =config.getInitParameter("message");
    }

    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        PrintWriter out = response.getWriter();
        
        Page.cssheader(out);
        
        out.println(message);

        Page.cssfooter(out);
    }

}

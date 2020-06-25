package char19;

import tool.Page;
import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/char19/param-context"})
public class ParamContext extends HttpServlet {
    
    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        PrintWriter out = response.getWriter();
        
        Page.cssheader(out);
        
        out.println(getServletContext().getInitParameter("message"));

        Page.cssfooter(out);
    }

}

package char19;

import tool.Page;
import java.io.*;
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/char19/get-attribute"})
public class GetAttribute extends HttpServlet {
    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        PrintWriter out = response.getWriter();
        
        Page.cssheader(out);
        
        ServletContext context = getServletContext();
        
        List<String> list = Collections.list(context.getAttributeNames());
        
        for (String name : list) {
            out.println("<p>" + name + " : ");
            out.println(context.getAttribute(name));
            out.println("<p>" + name + " : ");
            out.println("</p>");
        }
        
        String propertyVal = (String)context.getAttribute("debug");
        if (("yes").equals(propertyVal)) {
            out.println("<p>デバッグモードで実行</p>");
        }
        
        int memory = Integer.parseInt((String)context.getAttribute("memory"));
        if (memory < 1000000) {
            out.println("<p>省メモリモードで実行</p>");
        }
        
        Page.cssfooter(out);
    }

}

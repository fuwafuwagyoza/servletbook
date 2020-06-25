package char19;

import tool.Page;
import java.io.*;
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/char19/file"})
public class File extends HttpServlet {
    private String filepath = "/WEB-INF/files/setting.txt";

    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        PrintWriter out = response.getWriter();
        
        Page.cssheader(out);
        
        String path = getServletContext().getRealPath(filepath);
        
        FileInputStream fis = new FileInputStream(path);
        Properties p = new Properties();
        p.load(fis);
        fis.close();
        
        for (String key : p.stringPropertyNames()) {
            out.println("<p>" + key + " : " + p.getProperty(key) + "</p>");
        }

        Page.cssfooter(out);
    }

}

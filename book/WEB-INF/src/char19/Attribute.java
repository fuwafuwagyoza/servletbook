package char19;

import tool.Page;
import java.io.*;
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/char19/attribute"})
public class Attribute extends HttpServlet {
    private String filepath = "/WEB-INF/files/setting.txt";

    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        PrintWriter out = response.getWriter();
        
        Page.cssheader(out);
        
        ServletContext context = getServletContext();
        
        String path = context.getRealPath(filepath);
        
        FileInputStream fis = new FileInputStream(path);
        Properties p = new Properties();
        p.load(fis);
        fis.close();
        
        for (String key : p.stringPropertyNames()) {
            context.setAttribute(key, p.getProperty(key));
        }
        
        out.println("アプリケーション属性を設定しました");

        Page.cssfooter(out);
    }

}

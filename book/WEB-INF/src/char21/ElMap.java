package char21;

import bean.*;
import tool.Page;

import java.io.*;
import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet(urlPatterns={"/char21/elmap"})
public class ElMap extends HttpServlet {
    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("1", "太郎");
        m.put("2", "二朗");
        m.put("3", "さぶろう");
        m.put("4", "シロー");
        
        int[] array = {11, 22, 33, 44, 55};
        
        Test t = new Test();
        t.setMp(m);
        t.setArray(array);
        
        request.setAttribute("test", t);
//        request.setAttribute("price", "1234");
//        request.setAttribute("count", "34");
//        request.setAttribute("unko", "うんこうんこうんこうんこうんこ");
        
        request.getRequestDispatcher("../html/char21_el_map.jsp")
            .forward(request, response);
        
    }
}

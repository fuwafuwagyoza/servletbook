package char20;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

import java.io.*;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet(urlPatterns={"/char20/tag"})
public class Tag extends HttpServlet {
    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        Product p = new Product();
        p.setName("本仕込み醤油");
        p.setPrice(2010);
        p.setId(13);
        
        request.setAttribute("product", p);
        
        request.getRequestDispatcher("../html/char20_tag.jsp")
            .forward(request, response);
        
    }
}

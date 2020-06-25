package char17;

import bean.Product;
import tool.Page;
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/char17/cart-get"})
public class CartGet extends HttpServlet {

    @SuppressWarnings("unchecked")
    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        PrintWriter out = response.getWriter();

        Page.cssheader(out);

        HttpSession session = request.getSession();

        List<Product> cart = (List<Product>)session.getAttribute("cart");

        for (Product p : cart) {
            out.println("<p>");
            out.println(p.getName());
            out.println(":");
            out.println(p.getPrice());
            out.println("</p>");
        }

        Page.cssfooter(out);
    }

}

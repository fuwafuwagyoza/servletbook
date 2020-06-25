package char17;

import bean.Product;
import tool.Page;
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/char17/cart-remove"})
public class CartRemove extends HttpServlet {

    @SuppressWarnings("unchecked")
    public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, 
    IOException {
        PrintWriter out = response.getWriter();

        Page.cssheader(out);

        HttpSession session = request.getSession();

        session.removeAttribute("cart");

        out.println("カートを削除しました。");

        Page.cssfooter(out);
    }

}

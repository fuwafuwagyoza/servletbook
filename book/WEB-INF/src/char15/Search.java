package char15;
// test

import bean.Product;
import dao.ProductDAO;
import tool.Page;

import java.io.*;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet(urlPatterns={"/char15/search"})
public class Search extends HttpServlet {
	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();
		String word = request.getParameter("word");

		Page.cssheader(out);
		try {
			ProductDAO dao = new ProductDAO();
			List<Product> list = dao.search(word);
			
			for (Product p : list) {
				out.println(p.getId());
				out.println(":");
				out.println(p.getName());
				out.println(":");
				out.println(p.getPrice());
			    if (p.getPrice() >= 1000) {
			        out.println("★<br>");
			    } else {
			        out.println("<br>");
			    }
			}
			out.println("※1000円以上は★がつくのである");
			
		} catch (Exception e) {
			e.printStackTrace(out);
		}

		Page.cssfooter(out);
	}
}

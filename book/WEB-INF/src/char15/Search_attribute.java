package char15;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

import java.io.*;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet(urlPatterns={"/char16/search_a"})
public class Search_attribute extends HttpServlet {
	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();
		String word = request.getParameter("word");

		Page.cssheader(out);
		try {
			ProductDAO dao = new ProductDAO();
			List<Product> list = dao.search(word);
			
			request.setAttribute("productList", list);
			
			request.getRequestDispatcher("../html/char16_attributedb.jsp")
				.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace(out);
		}

		Page.cssfooter(out);
	}
}

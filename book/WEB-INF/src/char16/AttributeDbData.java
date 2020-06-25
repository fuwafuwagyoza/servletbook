package char16;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

import java.io.*;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;


@WebServlet(urlPatterns={"/char16/attributedb"})
public class AttributeDbData extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();
		try {
			ProductDAO dao = new ProductDAO();
			List<Product> list = dao.search("");
			
			request.setAttribute("productList", list);
			
			request.getRequestDispatcher("../html/char16_attributedb.jsp")
				.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		
	}
}

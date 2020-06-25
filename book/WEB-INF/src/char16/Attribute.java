package char16;

import bean.Product;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet(urlPatterns={"/char16/attribute"})
public class Attribute extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		Product product = new Product();
		product.setId(20);
		product.setName("オクレ兄さんの薬");
		product.setPrice(1000);
		
		request.setAttribute("product", product);
		
		request.getRequestDispatcher("../html/char16_attribute.jsp")
			.forward(request, response);
	}
}

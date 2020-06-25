package char15;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet(urlPatterns={"/char15/insert"})
public class Insert extends HttpServlet {
	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();

		// パラメータの取得
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));

		Page.cssheader(out);
		try {
			Product product = new Product();
			ProductDAO dao = new ProductDAO();
			
			product.setName(name);
			product.setPrice(price);
			int line = dao.insert(product);
			
			if (line > 0) {
				out.println("追加に成功しました。");
			}
			
		} catch (Exception e) {
			e.printStackTrace(out);
			
		}

		Page.cssfooter(out);
	}
}

package char15;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

import java.io.*;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet(urlPatterns={"/char15/insert_allsearch"})
public class Insert_AllSearch extends HttpServlet {
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
				List<Product> list = dao.search("");
				out.println("追加に成功しました。");
				out.println("<h2>商品一覧</h2>");
				out.println("<p>");

				for (Product p : list) {
					out.println(p.getId());
					out.println(":");
					out.println(p.getName());
					out.println(":");
					out.println(p.getPrice());
					out.println("<br>");
				}
				out.println("</p>");
			}
			
		} catch (Exception e) {
			e.printStackTrace(out);
			
		}

		Page.cssfooter(out);
	}
}

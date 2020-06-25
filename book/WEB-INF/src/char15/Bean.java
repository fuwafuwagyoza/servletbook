package char15;

import bean.Product;
import tool.Page;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/char15/bean"})
public class Bean extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();
		Page.cssheader(out);
		
		Product p = new Product();
		
		p.setId(1);
		p.setName("てすと");
		p.setPrice(1000);
		
		out.println(p.getId());
		out.println(":");
		out.println(p.getName());
		out.println(":");
		out.println(p.getPrice());
		out.println("<BR>");
		
		Page.cssfooter(out);
	}
}

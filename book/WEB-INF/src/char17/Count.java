package char17;

import tool.Page;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet(urlPatterns={"/char17/count"})
public class Count extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		
		HttpSession session = request.getSession();
		
		Integer count = (Integer) session.getAttribute("count");
		
		if (count == null) count = 0;
		count ++;
		session.setAttribute("count", count);
		
		out.println("<p>" + count + "<p>");
		out.println("<p>" + session.getId() + "<p>");
		
		Page.footer(out);
	}
}

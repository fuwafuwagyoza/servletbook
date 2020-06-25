package char4;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

//@WebServlet(urlPatterns={"/char3/*"})
public class Hello3 extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		Date date = new Date();
		
		Page.header(out);

		out.println("<p>Hello</p>");
		out.println("<p>" + date + "</p>");
		while (true) {
			out.println("<p>おはよー！！</p>");
			out.println("<p>こんちわー！！</p>");
			out.println("<p>こんばんわー！！</p>");
			out.println("<p>おやすみー！！</p>");
			out.println("<p></p>");
			if (Math.random() * 10 > 9.8) {
				out.println("<p>起きてー！！</p>");
				break;
			}
		}
		out.println("<p>" + date + "</p>");
		Page.footer(out);
	}
}

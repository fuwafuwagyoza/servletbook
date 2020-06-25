package char12;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char12/request"})
public class Request extends HttpServlet {
	int count;
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();

		out.println("<p>RequestURL<br>" + request.getRequestURL() + "<p>");
		out.println("<p>Host<br>" + request.getHeader("Host") + "<p>");
		out.println("<p>User-Agent<br>" + request.getHeader("User-Agent") + "<p>");
		out.println("<p>RemoteAddr<br>" + request.getRemoteAddr() + "<p>");

	}
}

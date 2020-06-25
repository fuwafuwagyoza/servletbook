package char12;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char12/response"})
public class Response extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		response.setStatus(301);

		response.setHeader("Location", "http://www.sbcr.jp");
	}
}

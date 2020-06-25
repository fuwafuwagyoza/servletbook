package char9;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char9/redirect"})
public class Redirect extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		// レスポンス情報作成
		response.sendRedirect("http://tomcat.apatch.org/");
	}

}

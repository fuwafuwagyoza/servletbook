package char9;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char9/include"})
public class Include extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		// レスポンス情報作成
		Page.cssheader(out);
		request.getRequestDispatcher("/html/char9_include1.jsp").include(request, response);
		request.getRequestDispatcher("/html/char9_include2.jsp").include(request, response);
		Page.cssfooter(out);
	}

}

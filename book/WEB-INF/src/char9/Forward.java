package char6;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char9/forward"})
public class Forward extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		// レスポンス情報作成
		request.getRequestDispatcher("/html/char9_foward.jsp").forward(request, response);
	}

}

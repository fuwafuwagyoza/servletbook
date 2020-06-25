package char9;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/char9/forwardfrom"})
public class ForwardFrom extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		// レスポンス情報作成
		request.getRequestDispatcher("/char9/fowardto").forward(request, response);
	}

}

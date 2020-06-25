package char11;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char11/count"})
public class CountThread extends HttpServlet {
	int count;
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();
		Page.cssheader(out);

		synchronized (this) {
			int i = count;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			count = ++i;
			out.println(count);
		}

		Page.cssfooter(out);
		
	}
}

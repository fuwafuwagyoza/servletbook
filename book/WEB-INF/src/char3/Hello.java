package char3;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/char3/*"})
public class Hello extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("start!");
		out.println(new Date());
		while (true) {
			if (Math.random() * 10 > 9.8) {
				out.println("Finish!");
				break;
			}
			out.println("この状態では文字化けするよ！");
			out.println("Hello!");
		}
	}
}

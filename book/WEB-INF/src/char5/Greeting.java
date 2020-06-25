package char5;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char5/greeting"})
public class Greeting extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("user");

		// htmlヘッダー部分（Pageクラスで実装）
		Page.header(out);

		out.println("<p>こんにちは" + user + "さん</p>");
//		out.println("<img src = \"../img/angel/61799874_p2.jpg\" />");
		// htmlフッター部分（Pageクラスで実装）
		Page.footer(out);
	}

	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
			request.setCharacterEncoding("UTF-8");
			String user = request.getParameter("user");
			int price = Integer.parseInt(request.getParameter("price"));
			int number = Integer.parseInt(request.getParameter("number"));

			// htmlヘッダー部分（Pageクラスで実装）
			Page.header(out);

			out.println("<p>こんにちは" + user + "さん</p>");
			out.println("<p>計算結果 ＝ " + (price * number) + "</p>");
//			out.println("<img src = \"../img/angel/61799874_p8.jpg\" />");
			// htmlフッター部分（Pageクラスで実装）
			Page.footer(out);
		} catch (NumberFormatException e) {
			out.println("数値を入力してください");
			
		}
	}


}

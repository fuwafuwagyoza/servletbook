package char9;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char9/fowardto"})
public class ForwardTo extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		// レスポンス情報作成
		//response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		// リクエストパラメータ取得
		//request.setCharacterEncoding("UTF-8");

		// htmlヘッダー部分（Pageクラスで実装）
		Page.cssheader(out);
		out.println("<p>フォワードしました</p>");
		out.println("<img src = \"../img/angel/61799874_p8.jpg\" />");
		// htmlフッター部分（Pageクラスで実装）
		Page.cssfooter(out);
	}

	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		// レスポンス情報作成
		//response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		// リクエストパラメータ取得（入力フォームの確認）
		//request.setCharacterEncoding("UTF-8");
		out.println("<h2>ここは使わない想定</h2>");
	}


}

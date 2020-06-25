package char6;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char6/select"})
public class Select extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		// レスポンス情報作成
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		// リクエストパラメータ取得（なし）
		request.setCharacterEncoding("UTF-8");

		// htmlヘッダー部分（Pageクラスで実装）
		Page.cssheader(out);
		out.println("<p>こっちは使いません！！</p>");
		out.println("<img src = \"../img/angel/61799874_p8.jpg\" />");
		// htmlフッター部分（Pageクラスで実装）
		Page.cssfooter(out);
	}

	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		// レスポンス情報作成
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		// リクエストパラメータ取得（入力フォームの確認）
		request.setCharacterEncoding("UTF-8");
		String count = request.getParameter("count");
		String payment = request.getParameter("payment");
		String review = request.getParameter("review");
		String mail = request.getParameter("mail");
		String[] genre = request.getParameterValues("genre");

		// リクエストパラメータ取得（パラメータの確認）
		List<String> names = Collections.list(request.getParameterNames());

		// htmlヘッダー部分（Pageクラスで実装）
		Page.cssheader(out);

		// htmlコンテンツ部分（入力フォームの確認）
		out.println("<h2>入力フォームの確認</h2>");
		out.println("<p>商品個数は" + count + "個です</p>");
		out.println("<p>支払方法は" + payment + "です</p>");
		out.println("<p>ご感想ありがとうございました</p>");
		out.println("<p>「" + review + "」</p>");
		if (mail != null) {
			out.println("<p>メール受け取る</p>");
			out.println("<img src = \"../img/angel/61799874_p8.jpg\" />");
		} else {
			out.println("<p>メール受け取らない</p>");
		}
		if (genre != null) {
			for (String item : genre) {
				out.println("<p>「"+ item +"」</p>");
			}
			out.println("<p>に関するお買い得情報をお送りします</p>");
		} else {
			out.println("<p>お買い得情報なし</p>");
		}

		// htmlコンテンツ部分（パラメータの確認）
		out.println("<h2>パラメータの確認</h2>");
		String[] values = null;
		for (String name : names) {
			values = request.getParameterValues(name);
			for (String value : values) {
				out.println("<p>" + name + " = " + value + "</p>");
			}
			out.println("<br>");
		}

		// htmlフッター部分（Pageクラスで実装）
		Page.cssfooter(out);
		
	}


}

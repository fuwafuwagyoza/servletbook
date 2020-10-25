package char14;

import java.io.*;
import tool.Page;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(urlPatterns={"/char14/transaction"})
public class Transaction extends HttpServlet {
	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();
		ResultSet result = null;

		// sql文
		String InsertStr = "INSERT INTO product VALUES (?, ?, ?)";
		String SelectStr = "SELECT Name FROM product Where Name = ?";
		String MaxIdStr = "SELECT MAX(ID)+1 AS ID FROM product";

		// パラメータの取得
		String name = request.getParameter("name");
		String price = request.getParameter("price");

		Page.cssheader(out);
		if (name.length() != 0 && price.length() != 0) {
			try {
				InitialContext ic = new InitialContext();
				DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/book");
				Connection con = ds.getConnection();
				
				// 自動コミットをオフ
				con.setAutoCommit(false);
				
				PreparedStatement SelSt = con.prepareStatement(SelectStr);
				SelSt.setString(1, name);
				result = SelSt.executeQuery();

				// 事前select研修の取得
				int line = 0;
				
				while (result.next()) {
					line ++ ;
				}
				
				if (line == 0) {
					
					SelSt = con.prepareStatement(MaxIdStr);
					PreparedStatement InsSt = con.prepareStatement(InsertStr);

					result = SelSt.executeQuery();
					while (result.next()) {
						InsSt.setString(1, result.getString("ID"));
					}
					
					InsSt.setString(2, name);
					InsSt.setString(3, price);
					int insline = InsSt.executeUpdate();
					
					if (insline > 0) {
						con.commit();
						out.println("追加に成功しました。");
					} else {
						con.rollback();
						out.println("追加に失敗しました。");
					}
					InsSt.close();

				} else {
					out.println(name + "はすでに登録済みです");
					
				}
				SelSt.close();
				con.close();
				
			} catch (Exception e) {
				e.printStackTrace(out);
				
			}
		} else {
			out.println("nameとpriceの値を両方入力してください");
		}

		Page.cssfooter(out);
	}

}

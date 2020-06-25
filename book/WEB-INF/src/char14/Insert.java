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

@WebServlet(urlPatterns={"/char14/insert"})
public class Insert extends HttpServlet {
	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();

		// sql文
		String InsertStr = "INSERT INTO PRODUCT VALUES (?, ?, ?)";
		String MaxIdStr = "SELECT MAX(ID)+1 AS ID FROM PRODUCT";

		// パラメータの取得
		String name = request.getParameter("name");
		String price = request.getParameter("price");

		Page.cssheader(out);
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/book");
			Connection con = ds.getConnection();
			
			PreparedStatement SelSt = con.prepareStatement(MaxIdStr);
			PreparedStatement InsSt = con.prepareStatement(InsertStr);

			ResultSet result = SelSt.executeQuery();
			while (result.next()) {
				InsSt.setString(1, result.getString("ID"));
//				out.println(result.getInt("ID"));
//				InsSt.setString(1, "1");
			}
			
			InsSt.setString(2, name);
			InsSt.setString(3, price);
			int line = InsSt.executeUpdate();
			
			if (line > 0) {
				out.println("追加に成功しました。");
			}
			
			SelSt.close();
			InsSt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace(out);
			
		}

		Page.cssfooter(out);
	}

}

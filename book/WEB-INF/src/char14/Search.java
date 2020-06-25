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

@WebServlet(urlPatterns={"/char14/search"})
public class Search extends HttpServlet {
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();
		String sqlStr = "SELECT * FROM PRODUCT WHERE NAME LIKE \'%?%\'";
		String word = request.getParameter("word");

		Page.cssheader(out);
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/book");
			Connection con = ds.getConnection();
			
			PreparedStatement st = con.prepareStatement(sqlStr);
			st.setString(1, word);
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				out.println(rs.getInt("ID"));
				out.println(":");
				out.println(rs.getString("NAME"));
				out.println(":");
				out.println(rs.getInt("PRICE"));
				out.println("<BR>");
			}
			
			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace(out);
			
		}

		Page.cssfooter(out);
	}

	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		PrintWriter out = response.getWriter();
		String sqlStr = "SELECT * FROM PRODUCT WHERE NAME like ? ";
		String word = request.getParameter("word");

		Page.cssheader(out);
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/book");
			Connection con = ds.getConnection();
			
			PreparedStatement st = con.prepareStatement(sqlStr);
			st.setString(1, "%" + word + "%");
//			out.println(st);
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				out.println(rs.getInt("ID"));
				out.println(":");
				out.println(rs.getString("NAME"));
				out.println(":");
				out.println(rs.getInt("PRICE"));
				out.println("<BR>");
			}
			
			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace(out);
		}

		Page.cssfooter(out);
	}
}

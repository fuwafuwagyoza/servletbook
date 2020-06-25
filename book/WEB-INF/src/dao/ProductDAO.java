package dao;

import bean.Product;
import java.sql.*;
import java.util.*;

public class ProductDAO extends DAO {
	public List<Product> search(String keyword) throws Exception {
		// 戻り値とDB接続の設定
		List<Product> list = new ArrayList<>();
		Connection con = getConnection();
		
		// sql文を設定
		String sqlStr = "select * from product where name like ?";
		
		// sql実行
		PreparedStatement st = con.prepareStatement(sqlStr);
		st.setString(1, "%" + keyword + "%");
		ResultSet rs = st.executeQuery();
		
		// sql実行結果を戻り値に格納
		while (rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt("id"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getInt("price"));
			list.add(product);
		}
		
		// DB切断
		st.close();
		con.close();
		
		return list;
	}
	
	public int insert(Product product) throws Exception {
		// 戻り値とDB接続の設定
		int line;
		Connection con = getConnection();
		
		// sql文を設定
		String sqlStr = "insert into product values(?, ?, ?)";
		
		// sql実行
		PreparedStatement st = con.prepareStatement(sqlStr);
		st.setInt(1, (_getMaxPK(product, con)).getId());
		st.setString(2, product.getName());
		st.setInt(3, product.getPrice());
		line = st.executeUpdate();
		
		// DB切断
		st.close();
		con.close();
		
		return line;
	}
	
	private Product _getMaxPK(Product product, Connection con) throws Exception {
		// 戻り値の設定
		int id;
		
		// sql文を設定
		String MaxIdStr = "SELECT MAX(to_number(ID))+1 AS ID FROM PRODUCT";
		
		// sql実行
		PreparedStatement SelSt = con.prepareStatement(MaxIdStr);
		ResultSet rs = SelSt.executeQuery();
		
		// sql実行結果を戻り値に格納
		while (rs.next()) {
			product.setId(rs.getInt("id"));
		}
		
		SelSt.close();
		
		return product;
	}
	
}
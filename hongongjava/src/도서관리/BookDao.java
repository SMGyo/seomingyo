package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDao {
	Connection conn = null;
	public void getOpen() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:Oracle:thin:@localhost:1521:xe",
					"java",
					"1234");
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void getClose() {
		if(conn != null) {
			try {
				conn.close();
				System.out.println("연결끊음");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public int insert(Book book) {
		getOpen();
		try {
			String sql = "insert into book (title,writer,price,bnum)"
					+ " values (?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getWriter());
			pstmt.setInt   (3, book.getPrice());
			pstmt.setString(4, book.getBnum());
			int rows = pstmt.executeUpdate();
			return rows;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return 0;
	}
	public int delete(Book book) {
		
		
		return 0;
	}
}


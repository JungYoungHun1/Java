package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// DB 연결 기능 메소드
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
	}

	// DB 자원반환 : close
	public static void close(ResultSet rset, Statement stmt, Connection con) {
		try {
			if (rset != null) {
				rset.close();
				rset = null;

			}
			if (stmt != null) {
				stmt.close();
				stmt = null;

			}
			if (con != null) {
				con.close();
				con = null;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt, Connection con) {
		close(null, stmt, con);
	}
}

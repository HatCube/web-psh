package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	private static final String url = "jdbc:mysql://localhost:3306/rental_db";
	
	private static final String user = "root";
	
	private static final String password = "admin1234";
	
	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(
				url, user, password);
	}
}

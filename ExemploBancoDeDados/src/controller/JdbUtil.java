package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbUtil {
	private static String connectionDriverClass="com.mysql.jdbc.Driver";
	private static String connectionUrl = "jdbc:mysql://localhost/java";
	private static String connectionUsername="root";
	private static String connectionPassword="";
	private static Connection conn;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if(jdbUtil.conn != null) {
			return jdbUtil.conn;
		}
		else {
			Class.forName(connectionDriverClass);
			return DriverManager.getConnection(
					jdbUtil.connectionUrl,
					jdbUtil.connectionUsername,
					jdbUtil.connectionPassword);
					
		}
	}

}

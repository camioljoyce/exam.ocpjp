package exam.ocpjp.v1.q042;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Test {
	private static final String userName = "camiol";
	private static final String passWord = "1qaz@WSX";
	private static final String dbURL = "127.0.0.1/camiol";
	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.put("user", userName);
			prop.put("password",passWord);
		
			Connection conn = DriverManager.getConnection(dbURL,prop);
			if(conn!=null) {
				System.out.println("Connection Established!");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}

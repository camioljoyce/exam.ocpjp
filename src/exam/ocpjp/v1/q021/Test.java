package exam.ocpjp.v1.q021;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	private static final String dbURL = "127.0.0.1:1433/camiol";
	private static final String userName = "camiol";
	private static final String password = "1qaz@WSX";
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection(dbURL,userName,password);
		String query = "select id from Employee";
		
		try (Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery(query);
			stmt.executeQuery("select id from Customer");
			while(rs.next()) {
				System.out.println("Employee ID : "+rs.getInt("id"));
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

		//What is the result of compiling and executing this code fragment?
		//Ans: The program prints Error.
		//程式第21行，又用了一次Statement物件的executeQuery方法，會使得先前的ResultSet自動被關閉，因此程式第22行會拋出SQLException。
	}

}

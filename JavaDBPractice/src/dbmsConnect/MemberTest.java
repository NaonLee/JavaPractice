package dbmsConnect;

import java.sql.*;

public class MemberTest {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String user = "naon";
	private static final String pwd = "password01";
	
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		try {
			Class.forName(driver);
			System.out.println("Oracle driver loading.");
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Created connection.");
			stmt = conn.createStatement();
			System.out.println("Created statement object");
			String query = "select * from t_member";
			System.out.println(query);
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.print("ID: " + rs.getString("id"));
				System.out.print(", Name: " + rs.getString("name"));
				System.out.println();
			}
			
			rs.close();
			stmt.close();
			
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
	}

}

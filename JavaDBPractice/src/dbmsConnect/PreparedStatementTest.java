package dbmsConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementTest {

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
			//stmt = conn.createStatement();
			//System.out.println("Created statement object");
			
			//반복적인 처리에는 PreparedStatement 가 효과적임
			PreparedStatement pstmt = conn.prepareStatement("select * from t_member where id = ?");
			System.out.println("Prepared statment has been set.");
			
			//첫번째 ?에 값 넣기. 실제로 로그인 시 id를 찾을때는 userID를 매개변수로 받아와서 'hong'자리에 넣으면 해당 아이디가 있는지 검색 가능
			
			pstmt.setString(1, "hong");
			
			rs = pstmt.executeQuery();				//id, pw매칭 검사 가능
			
			//PreparedStatement pstmt = conn.prepareStatment("select pw from t_member where id= ?");
			//pstmt.setString(1, userID);
			//rs = pstmt.excuteQuery();
			//if(rs.next()){
			//		if(rs.getString(1).equals(userPW)) return 1
			
			while(rs.next()) {
				System.out.print("ID: " + rs.getString("id"));
				System.out.print(", Name: " + rs.getString("name"));
				System.out.println();
			}
			
			rs.close();
			pstmt.close();
			
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
	}

}

package user;

import java.sql.Connection; 
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection()//데이터베이스와 연결상태 관리 
	{  
		try 
		{ 
			// 연결하고자 하는 db 주소
			String dbURL = "jdbc:mysql://localhost:3306/BBS?useSSL=false&serverTimezone=UTC";
			// db 아이디
			String dbID = "root";
			// db 패스워드
			String dbPassword = "root"; 
			// jdbc 드라이버 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 연결하기 위한 커넥션 정보
			return DriverManager.getConnection(dbURL, dbID, dbPassword);  
		} catch (Exception e){
			e.printStackTrace(); 
		} 
		return null;
		}
}


	

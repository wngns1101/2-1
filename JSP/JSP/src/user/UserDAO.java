package user; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import user.DatabaseUtil;

public class UserDAO 
{ 
	Connection conn = DatabaseUtil.getConnection(); 
	// 각각의 데이터를 실제로 넣어준다. 
	PreparedStatement pstmt; 
	private ResultSet rs;
				
	public int login(String userID, String userPassword) {
		String SQL = "SELECT userPassword FROM USER WHERE userID = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setNString(1, userID);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if(rs.getNString(1).contentEquals(userPassword)) {
					return 1; //로그인 성공
				}
				else
					return 0; //비밀번호 불일치
			}
			return -1; //아이디가 없음
		}catch (Exception e) {
			e.printStackTrace();
		}
		return -2;
	}

	
	
	public int join(String userID, String userPassword, String userName, String userGender, String userEmail)
	{ 
		String SQL = "INSERT INTO USER VALUES (?,?,?,?,?)"; 
		try 
		{ 
			// 각각의 데이터를 실제로 넣어준다. 
			pstmt = conn.prepareStatement(SQL); 
						
			// 쿼리문의 ?안에 각각의 데이터를 넣어준다. 
			pstmt.setString(1, userID); 
			pstmt.setString(2, userPassword);
			pstmt.setString(3, userName);
			pstmt.setString(4, userGender);
			pstmt.setString(5, userEmail);
			
			// 명령어를 수행한 결과 반환, 반환값: insert가 된 데이터의 개수 
			return pstmt.executeUpdate(); 
			
		} catch (Exception e){
		 
			e.printStackTrace(); 
		} 
		
		return -1; 
		}
	
		
	}

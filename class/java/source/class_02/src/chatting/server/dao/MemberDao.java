package chatting.server.dao;
/*
 	회원 정보 처리용 클래스
 */

import java.sql.*;
import db.*;

public class MemberDao {
	MyJDBC db;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	public MemberDao() {
		db = new MyJDBC();
	}
	
	// 회원 로그인 처리 데이터베이스 작업 전담 함수
	public int getLogin(String id, String pw) {
		int cnt = 0;
		
		// Connection
		con = db.getCon();
		String sql = "SELECT COUNT(*) CNT FROM MEMBER WHERE id = ? AND pw = ? AND isshow = 'Y'";
		pstmt = db.getPSTMT(con, sql);
		try {
			// 질의 명령 완성하고
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			//질의명령 실행하고 결과받고
			rs = pstmt.executeQuery();
			rs.next();
			
			cnt = rs.getInt("cnt");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.getCon();
		}
		// 데이터 반환받고
		return cnt;
	}

}

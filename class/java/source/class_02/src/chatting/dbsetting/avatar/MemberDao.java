package chatting.dbsetting.avatar;

import java.util.*;
import java.sql.*;

import db.*;
public class MemberDao {
	MyJDBC db1;	// 데이터 가져오기 db
	MyJDBC db2;	// 내 데이터베이스 db
	
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	ArrayList<MemberVO> list;
	public MemberDao() {
		list = new ArrayList<MemberVO>();
		db1 = new MyJDBC("192.168.0.21");
		db2 = new MyJDBC();
	}
	// 데이터 가져오기 전담 처리 함수
	public void getData() {
		con = db1.getCon();
		String sql = "SELECT * FROM AVATAR";
		stmt = db1.getSTMT(con);
		
		try {
			rs = stmt.executeQuery(sql);
			int cntno =0;
			while(rs.next()) {
				// 매번 반복해서 한사람의 정보를 만듥
				MemberVO mVO = new MemberVO();
				mVO.setMno(rs.getInt("mno"));
				mVO.setId(rs.getString("id"));
				mVO.setPw("12345");
				mVO.setName(rs.getString("name"));
				mVO.setMail(rs.getString("mail"));
				mVO.setGen(rs.getString("gen"));
				mVO.setAvt(rs.getInt("avt"));
				mVO.setJoinDate(rs.getDate("joindate"));
				mVO.setJoinTime(rs.getTime("joindate")); //함수가 별도로 뽑아옴
				mVO.setIsshow(rs.getString("isshow"));
				System.out.println(cntno);
				cntno =cntno+1;
				//만들어진 정보를 리스트에 담고
				list.add(mVO);
			}
		} catch(Exception e) {
			
		} finally {
			db1.close(rs);
			db1.close(stmt);
			db1.close(con);
		}
	}
	// 내 데이터베이스에 데이터 저장하는 함수
	
		public int setData() {
			int cnt = 0;
			
			con = db2.getCon();
			String sql = "INSERT INTO member  VALUES(" +
						"?,?,?,?,?,?,?,TO_DATE(?,'yyyy/mm/dd HH:MI:ss'),?"+
						" )";
			pstmt = db2.getPSTMT(con, sql);
			
			try {
				//질의명령 완성하고
				for(int i  = 0 ; i < list.size(); i++) {
					System.out.println(list.get(i).getId());
					MemberVO mVO = list.get(i);
					
					/*
					pstmt.setInt(1, list.get(i).getMno());
					pstmt.setString(1, list.get(i).getId());
					pstmt.setString(3, list.get(i).getPw());
					pstmt.setString(4, list.get(i).getName());
					pstmt.setString(5, list.get(i).getMail());
					pstmt.setString(6, list.get(i).getGen());
					pstmt.setInt(7, list.get(i).getAvt());
					pstmt.setString(8, list.get(i).getSdate());
					pstmt.setString(9, list.get(i).getIsshow());
					*/
					
					pstmt.setInt(1, mVO.getMno());
					System.out.println(mVO.getMno());
					pstmt.setString(2, mVO.getId());
					System.out.println(mVO.getId());
					pstmt.setString(3, mVO.getPw());
					pstmt.setString(4, mVO.getName());
					pstmt.setString(5, mVO.getMail());
					pstmt.setString(6, mVO.getGen());
					pstmt.setInt(7, mVO.getAvt());
					pstmt.setString(8, mVO.getSdate());
					pstmt.setString(9, mVO.getIsshow());
					
					System.out.println("되는중");
					// 계속 채워주고
					
					int no = pstmt.executeUpdate();
					if(no == 1 ) cnt+=1;
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				db2.close(pstmt);
				db2.close(con);
			}
			
			
			
			return cnt;
		}
}

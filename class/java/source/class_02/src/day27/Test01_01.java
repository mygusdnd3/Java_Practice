package day27;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

import db.*;
public class Test01_01 {
	
	MyJDBC db;
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	

	
	public Test01_01() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id ="hello";
		String pw ="hello";
		try {
			con = DriverManager.getConnection(url,id,pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db = new MyJDBC();
		getList();
		getInfo();
	}
	public void getList() {
		//할일
		
		//접속(Connection) 을 얻어온다.
		//con = db.getCon();
		// 질의명령 만들고
		StringBuffer buff = new StringBuffer();
		buff.append("SELECT ");
		buff.append(" id ");
		buff.append("FROM ");
		buff.append(" member01 ");
		buff.append("WHERE");
		buff.append(" isshow = 'Y'");
		String sql = buff.toString();
		//3. Statement 만들고
		stmt = db.getSTMT(con);
		
		//4. 질의명령 실어서 보내고 결과받고
		try {
			rs = stmt.executeQuery(sql);
			//5. 결과값 꺼내서 처리해주고
			StringBuffer msg = new StringBuffer();
			while(rs.next()) {
				String sid = rs.getString("id") + "\n";
				msg.append(sid);
			}
			System.out.println(msg.toString());
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
//			db.close(rs);
//			db.close(stmt);
//			db.close(con);
			
		}
	}
		// 회원 정보 조회 처리 함수
		public void getInfo() {
			//할일
			//1. 조회할 아이디 입력받고
			String sid = "WOONG";
			
			//2. Connection 입력받고
			//con = db.getCon(); //위에서 콘을 닫음
			//3. 질의명령 만들고
			StringBuffer buff = new StringBuffer();
			buff.append("SELECT ");
			buff.append("	mno, name, mail, tel, gen, avt, joinDate ");
			buff.append("FROM ");
			buff.append("	member01 ");
			buff.append("WHERE ");
			buff.append("	id = ?");
			String sql = buff.toString();
			String sql2 = "SELECT mno, name, mail, tel, gen, joinDate FROM member01 WHERE id =?";
			//4. PreparedStatement 만들고
			pstmt = db.getPSTMT(con, sql);
			try {
				//5. 질의명령 완성하고 << ? 대신 채워주고
				pstmt.setString(1, sid);
				//6. 질의명령 실행요청하고 결과받고
				rs = pstmt.executeQuery();
				//7. 데이터 꺼내서 처리하고
				rs.next();
	
				StringBuffer b1 = new StringBuffer();
				b1.append("회원번호 : ");
				b1.append(rs.getInt("mno")+"\n");
				b1.append("회원이름 : ");
				b1.append(rs.getString("name")+"\n");
				b1.append("회원메일 : ");
				b1.append(rs.getString("mail")+"\n");
				b1.append("전화번호 : ");
				b1.append(rs.getString("tel")+"\n");
				b1.append("회원성별 : ");
				b1.append(rs.getString("gen").equals("M")?"남자" :"여자");
				b1.append("\n");
				b1.append("아 바 타 : ");
				b1.append(rs.getInt("avt"));
				b1.append("가입일자 : ");
				// 날짜 데이터는 JDBC 에서는 날짜와 시간을 분리해서 꺼내도록 해 노핬다.
				// 따라서 날짜와 시간을 분리해서 꺼내고 문자열 형태로 만들어줘야한다.
				// 그래야 보기 편하니까
				Date jDate = rs.getDate("joinDate");
				Time jTime = rs.getTime("joinDate");
				SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 MM월 dd일 "); 
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss"); 
				String sDate = form1.format(jDate)+form2.format(jTime);
				
				b1.append(sDate+"\n");
				System.out.println(b1.toString());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
		}
	public static void main(String[] args) {
		new Test01_01();
	}

}

package day27;

import db.*;
import java.sql.*;
import java.util.Scanner;

import day27.sql.*;

public class Test03 {
	/*
 	작업 코드를 입력 받는다.
 		l	:	화면 아이디 리스트 조회
 		==> 콘솔 화면에 아이디 리스트가 출력
 		
 		i	:	회원 정보 조회
 		==> 해당 아이디를 입력 받아서
 			해당 아이디의 정보를 조회하고
 			콘솔화면에 출력
 			
 		p	: 전단계 이동
 		q	:	프로그램 종료
 	
 */
	MyJDBC db;
	MemberSQL mSQL;
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Test03() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id ="hello";
		String pw ="hello";
		
		try {
			con = DriverManager.getConnection(url,id,pw);
		} catch (Exception e) {
			
		}
		db = new MyJDBC();
		mSQL = new MemberSQL();
		System.out.println("작업 코드를 입력하세요.");
		System.out.println("l : 회원 리스트 조회\n i : 회원정보 조회\n q : 프로그램 종료");
		Scanner sc = new Scanner(System.in);
		String work = sc.nextLine();
		if(work.equals("l")) {
		
			getList();
		} else if(work.equals("i")) {
			
		} else if(work.equals("p")) {
			
		}
	}
	public void getInfo(String id) {
		String querry = mSQL.getSQL(1002);
		stmt = db.getSTMT(con);
		pstmt = db.getPSTMT(con, querry);
		try {
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void getList() {
		
		String querry = mSQL.getSQL(1001);
		stmt = db.getSTMT(con);
		try {
			rs = stmt.executeQuery(querry);
			StringBuffer msg = new StringBuffer();
			System.out.println("회원 아이디 리스트");
			System.out.println("==================");
			while(rs.next()) {
				String sid = rs.getString("id")+"\n";
				msg.append(sid);
			}
			System.out.println(msg.toString());
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		new Test03();
	}

}
 
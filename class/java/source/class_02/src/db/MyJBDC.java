package db;

/**
 * 
 * @author 서현웅
 * @since 2020.09.17
 * @version v.1.0
 */
/*
 	이 클래스는 향후 JDBC 작업을 할 때 필요한
 	나만의 부품을 만들 예정이다.
 	
 	즉, JDBC 작업은 반복적인 작업이 많이 포함되어 있다.
 	
 	이 작업을 좀더 편하게 하기 위해서 나만의 부품을 만들어 놓고
 	사용할 예정이다.
 	
 	반복작업을 자동으로 해주는 기능을 만들 예정이다.
 */

import java.sql.*;
public class MyJBDC {
	/*
	  	누군가 이 부품이 필요해서 new 시키면
	  	생성자 함수가 호출이 될 것이고
	  	그 순간 드라이버 로딩이 자동으로 처리되게 해주고자 한다.
	 
	 */
	String url,id,pw;
	public MyJBDC() {
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("### 드라이버 로딩 실패 ###");
			
		}
		this.url = "jdbc:oracle:thin:@localhost:1521:orcl";
	}
	public MyJBDC(String ip) {
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("### 드라이버 로딩 실패 ###");
			
		}
		this.url = "jdbc:oracle:thin:@"+ip+":1521:orcl";
		
	}
	
	//Connection 반환해주는 함수
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public Connection getCon(String id, String pw) {
		Connection con = null;
		this.id = id;
		this.pw = pw;
		try {
			con = DriverManager.getConnection(url,id,pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
		
	
	// Statement 반환해주는 함수
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return stmt;
	}
	// PreparedStatement 반환해주는 함수
	public PreparedStatement getPSTMT(Connection con,String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pstmt;
	}
	// 다사용한 자원 반환해주는 함수
	public void close(Object obj) {
		// 반환 해야할 자원의 종류가 네가지가 있기 때문에
		// 네가지 모두를 기억할 수 있는 데이터 타입은 Object 이다.
		
		// 입력된 데이터의 소속을 밝혀서 처리해주면된다.
		 try{
			if(obj instanceof Connection) {
				((Connection) obj).close();
			}else if(obj instanceof Statement) {
				((Statement) obj).close();
			}else if(obj instanceof PreparedStatement) {
				((PreparedStatement) obj).close();
			}else if(obj instanceof ResultSet) {
				((ResultSet) obj).close();
			}
		 } catch(Exception e) {
			 e.printStackTrace();
		 }
	}
}

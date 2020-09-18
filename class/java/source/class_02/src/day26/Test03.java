package day26;

import java.sql.*;

import javax.swing.JOptionPane;

/*
  아이디를 입력하면 해당아이디 소유자를 알려주는 프로그램을 작성하세요.
  단, PreparedStatement 를 사용해서 처리.
 
 */
public class Test03 {
	Connection con = null;
	PreparedStatement pstmt= null;
	ResultSet rs = null;
	public Test03() {
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//데이터베이스에 연결
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id ="hello";
			String pw ="hello";
			con = DriverManager.getConnection(url,id,pw);

			// 질의 명령 만들고
			String sql = "SELECT name FROM MEMBER01 WHERE id = ? "; //질의명령 만들고

			
			//PreparedStatement를 만든다.
			pstmt = con.prepareStatement(sql);
			
			//데이터 입력받고
			String sid = JOptionPane.showInputDialog("조회할 아이디를 입력하세요!"	);
			
			//질의명령 완성하고
			pstmt.setString(1, sid);
			//이제 질의 명령의 ? 가 실제 데이터로 채워져서 실행가능한 상태가 되었다.
			//따라서 이제 질의명령을 실행해 달라고 요청만 하면 된다.
			
			//질의명령 실행 요청하고 결과받고
			boolean result = pstmt.execute();
			rs = pstmt.executeQuery();
			// 작업 행 이동시키고
			rs.next();
			// 데이터 꺼내고 <== 이제 작업행은 실제 결과 첫번째 행으로 이동한 상태이므로
			// 필요한 데이터를 꺼내기만 하면 된다.
			String name = rs.getString("name");
			
			System.out.println(result);
			// 출력한다
			
			JOptionPane.showMessageDialog(null, "입력한아이디"+sid+"는"+name+"회원이 사용중입니다.");
		} catch (Exception e) {
			 e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

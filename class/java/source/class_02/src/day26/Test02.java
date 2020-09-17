package day26;

import java.sql.*;

/*
 	JDBC를 사용해서 회원을 추가해 보자.
 	
 	INSERT INTO
    MEMBER01(MNO,ID,NAME,MAIL,TEL,GEN,AVT)
	VALUES(
    	(SELECT NVM(MAX(MNO)+1,1000) FROM member01)
    	, 'JUN','전준우','JUN@GMAIL.COM',
    	'010-5795-5484','M',12
);
 		
 */
public class Test02 {

	public Test02() {
		Connection con = null;
		Statement stmt = null;
		try {
			

					// 1. 드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("*****드라이버 로딩 성공*****");
					// 2. 커넥션 얻어오고
				String url ="jbdc:oracle:thin:@localhost:1521:orcl";
				String id ="hello";
				String pw = "hello";
				
				con = DriverManager.getConnection(url, id, pw);
				con.pre
				System.out.println("접속성공");
					// 3. Statement 만들고
					stmt = con.createStatement();
					// 4. 질의명령을 실어서 내보내고
					
					String sql = "";
					StringBuffer buff = new StringBuffer();
					buff.append("INSERT INTO ");
					buff.append("MEMBER01(MNO,ID,NAME,MAIL,TEL,GEN,AVT) ");
					buff.append("VALUES() ");
					buff.append("(SELECT NVM(MAX(MNO)+1,1000) FROM member01) ");
					buff.append(", 'JINWOO','전진우','JIN@GMAIL.COM', ");	
					buff.append("'010-7979-7179','M',13");	
				    buff.append(") ");
				    sql = buff.toString();
				    //sql = new String(buff)
					// 4. 질의명령을 실어서 내보내고
				 int cnt =stmt.executeUpdate(sql);
				 
				 if(cnt!=1) {
					 System.out.println("실패");
				 }else {
					 System.out.println("성공");
				 }
				    //ㅂㄹ낭렂ㄷㄹ반환값은 1이다
				    	//인서트는 반환값1  데이터를 한개씩추가해서
				    	//업데이트는 
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test02();
		
	}

}

package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class T_JDBC {
	 
	public T_JDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "hello";
			String pw = "hello";
			
			Connection con = DriverManager.getConnection(url,id,pw);
//			String sql = "SELECT empno, ename, job, hiredate FROM emp01";
//			PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			
//			ResultSet rs = ps.executeQuery();
//			
//			rs.last();
//			int cnt = rs.getRow();
//			System.out.println("검색 결과 : "+cnt+"행 검색!");
//			
//			rs.beforeFirst();
//			int i = 1;
//			while(rs.next()) {
//				System.out.println(i+" 번 ==>"+rs.getInt("empno")+"||"+rs.getString("ename")+"||"+rs.getString("job")+"||"+rs.getDate("hiredate")+"||");
//				i++;
//			}
			
			String sql2 = "SELECT empno FROM emp01 WHERE name = ?";
			PreparedStatement ps2 = con.prepareStatement(sql2);
			//String sid = JOptionPane.showInputDialog("조회할데이터");
			String sid = "SMITH";
			ps2.setString(1, sid);
			
			ResultSet rs2 = ps2.executeQuery();
			
			rs2.next();
			
			String num = rs2.getString("empno");
			System.out.println(num);
			//System.out.println(i+" 번 ==>"+rs2.getInt("empno")+"||"+rs2.getString("ename")+"||"+rs2.getString("job")+"||"+rs2.getDate("hiredate")+"||");
			
					
		}
		catch(Exception e) {
			
		}
	}


	public static void main(String[] args) {
		new T_JDBC();
	}

}

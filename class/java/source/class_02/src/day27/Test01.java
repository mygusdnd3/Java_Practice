package day27;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import db.MyJBDC;
public class Test01 {
	
	MyJBDC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	JFrame frame;
	JPanel pan1, pan2;
	JTextArea area;
	JButton btn1, btn2, btn3;
	
	public Test01() {
		// 이 클래스는 데이터베이스 작업이 반드시 필요한 프로그램 이므로
		// 먼저 데이터베이스를 사용하도록 드라이버 로딩작업을 해 놓는다. 
		// 우리는 그런 작업들을 이미 클래스로 구현 해 놓았다.
		
		db = new MyJBDC();
		setUI();
		
		// 화면 만들기
	}
	
	
	public void setUI() {
			frame = new JFrame("회원 조회 서비스");
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			pan1 = new JPanel(new BorderLayout());
			pan2 = new JPanel(new GridLayout(1,3));
			
			pan1.setPreferredSize(new Dimension(300,400));
			pan2.setPreferredSize(new Dimension(300, 30));
			
			//버튼추가
			btn1 = new JButton("조회");
			btn2 = new JButton("정보");
			btn3 = new JButton("종료");
			
			// 버튼에 이벤트 추가
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					area.setText("test Test Test");
				}
			});
			btn3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			//pan2 에 버튼추가
			pan2.add(btn1);
			pan2.add(btn2);
			pan2.add(btn3);
			
			frame.add(pan1, BorderLayout.CENTER);
			frame.add(pan2, BorderLayout.SOUTH);
			
			frame.setSize(300,430);
			frame.setVisible(true);
			frame.setResizable(false);
	}
	
	// 회원 리스트 조회 처리 함수
	public void getList() {
		//할일
		
		//접속(Connection) 을 얻어온다.
		con  = db.getCon();
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
			area.setText(msg.toString());
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
			
		}
		
		
		
	}
	// 회원 정보 조회 처리 함수
	public void getInfo() {
		//할일
		//1. 조회할 아이디 입력받고
		String sid = JOptionPane.showInputDialog("조회할 아이디입력");
		
		//2. Connection 입력받고
		con = db.getCon("hello","hello");
		//3. 질의명령 만들고
		StringBuffer buff = new StringBuffer();
		buff.append("SELECT "); 
		buff.append(" mno,"); 
		buff.append(" name,"); 
		buff.append(" mail,"); 
		buff.append(" tel,");  
		buff.append(" gen,");  
		buff.append(" joinDate"); 
		buff.append(" joinDate");
		buff.append("FROM"); 
		buff.append(" member01") ;
		buff.append("WHERE"); 
		buff.append(" id = ?"); 
		String sql = buff.toString();
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
			
			area.setText(b1.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}

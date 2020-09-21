package day28.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import day28.sql.MemberSQL;
import day28.vo.MemberVO;
import db.MyJDBC;

public class MemberDao {
	MyJDBC db;
	MemberSQL mSQL;
	Connection con;
	PreparedStatement pstmt;
	PreparedStatement pstmt2;
	ResultSet rs;
	ResultSet rs2;
	MemberVO mv;

	public MemberDao() {
		db = new MyJDBC();
		mSQL = new MemberSQL();
	}

	// 회원리스트 가져오기 데이터베이스 작업 전담 처리함수
	public ArrayList<MemberVO> getList() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		System.out.println("this");
//		con = db.getCon("hello", "hello");

		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.SEL_MEMB_LIST);
		String sql2 = mSQL.getSQL(mSQL.SEL_MEMB_INFO);
//		String sql = "select id from member01 where isshow = 'Y'";
//		String sql2 = "select mno, id, name, pw, mail, tel, gen, avt, joindate from member01 where id = ?";
		pstmt = db.getPSTMT(con, sql);
		System.out.println(sql);
//		pstmt2 = db.getPSTMT(con, sql2);

//		StringBuffer buff = new StringBuffer();
		ArrayList<String> slist = new ArrayList<String>();
		try {
			rs = pstmt.executeQuery();
//			rs.next();
//			buff.append(rs.getString("id"));
//			System.out.println(buff.toString());
//			db.close(pstmt);

			while (rs.next()) {
//				buff.append(rs.getString("id"));
				slist.add(rs.getString(1));
			}
			db.close(rs);
			db.close(pstmt);

			pstmt2 = db.getPSTMT(con, sql2);

			for (String s : slist) {
				System.out.println(sql2);
//			pstmt2.setString(1, rs.getString("id"));
				pstmt2.setString(1, s);

				rs2 = pstmt2.executeQuery();
				while (rs2.next()) {
					mv = new MemberVO();
					mv.setMno(rs2.getInt("mno"));
					mv.setId(rs2.getString("id"));
					mv.setName(rs2.getString("name"));
					mv.setMail(rs2.getString("mail"));
					mv.setTel(rs2.getString("tel"));
					mv.setGen(rs2.getString("gen"));
					mv.setAvatar(rs2.getString("avt"));
					mv.setJoindate(rs2.getDate("joindate"));
//					mv.setJoinTime(rs2.getTime("joinTime"));

					list.add(mv);
				}
			}
			
			for (MemberVO mv : list) {
				System.out.println(mv);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	public int idCount(String id) {
		int cnt = 0;
		
		return cnt;
	}

}

package day28.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import day28.sql.MemberSQL;
import db.MyJDBC;
import day28.vo.*;
import day28.vo.MemberVO;
public class Test01 {

	public Test01() {
	}

	public static void main(String[] args) {
		MemberVO mvo= null;
		MyJDBC db = new MyJDBC();
		MemberSQL msql = new MemberSQL();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<MemberVO> mlist = new ArrayList<MemberVO>();
		
		Connection con = db.getCon();
		String sql = msql.getSQL(msql.SEL_MEMB_LIST);
		
		PreparedStatement ppst = db.getPSTMT(con, sql);
//		StringBuffer buff = new StringBuffer();
		
		try {
			ResultSet rs =ppst.executeQuery();
			while(rs.next()) {
				System.out.println("아이디 목록 :"+ rs.getString("id"));
				list.add(rs.getString("id"));
//				buff.append(rs.getString("id")+"\n");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			try {
				ppst.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		sql = msql.getSQL(msql.SEL_MEMB_INFO);
		ppst = db.getPSTMT(con, sql);
		
		for(int i = 0; i<list.size(); i++) {
		try {
			ppst.setString(1, list.get(i));
			ResultSet rs = ppst.executeQuery();
			rs.next();
				mvo = new MemberVO();
				mvo.setMno(rs.getInt("mno"));
				mvo.setId(rs.getString("id"));
				mvo.setName(rs.getString("name"));
				mvo.setMail(rs.getString("mail"));
				mvo.setTel(rs.getString("tel"));
				mvo.setGen(rs.getString("gen"));
				mvo.setAvatar(rs.getString("avt"));
				mvo.setSdate(rs.getDate("joindate").toString());
				
				
				mlist.add(mvo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		}
		
		//  출력
		for(MemberVO v : mlist) {
			System.out.println(v);
		}
		
		
		 con = db.getCon();
		sql = "Insert into member01 VALUES("
		
		ppst = db.getPSTMT(con, sql);
		
		
	}

}

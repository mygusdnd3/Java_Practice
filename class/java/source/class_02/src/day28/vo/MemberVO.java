package day28.vo;


import java.sql.*;
import java.text.*;

public class MemberVO {
	private int mno, ano;
	private String id, name, pw, mail, tel, avatar, aname, gen, sdate;
	private Date joinDate;
	private Time JoinTime;
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	private Date joindate;
	private Date jointime;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public void setGen() {
		this.gen = gen.equals("M")?"남자" : "여자";
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
		
	}
	public void setSdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		this.sdate = form1.format(joindate) + " " + form2.format(joinTime);
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public Time getJoinTime() {
		return joinTime;
	}
	public Date getJointime() {
		return jointime;
	}
	public void setJointime(Date jointime) {
		this.jointime = jointime;
	}
	public void setJoinTime(Time joinTime) {
		this.joinTime = joinTime;
		setSdate();
	}
	@Override
	public String toString() {
		return "회원정보 mno=" + mno + ", ano=" + ano + ", id=" + id + ", name=" + name + ", mail=" + mail + ", tel="
				+ tel + ", avatar=" + avatar + ", aname=" + aname + ", gen=" + gen + ", sdate=" + sdate + ", joindate="
				+ joindate + ", joinTime=" + joinTime ;
	}
	private Time joinTime;
	

}

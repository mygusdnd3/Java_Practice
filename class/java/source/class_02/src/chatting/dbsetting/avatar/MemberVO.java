package chatting.dbsetting.avatar;


import java.sql.*;
import java.text.*;
public class MemberVO {
	private int ano;
	private String aname, gen, afile, dir,len;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
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
	public String getAfile() {
		return afile;
	}
	public void setAfile(String afile) {
		this.afile = afile;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getLen() {
		return len;
	}
	public void setLen(String len) {
		this.len = len;
	}
}
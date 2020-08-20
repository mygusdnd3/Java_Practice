package day25;
import java.io.*;
public class Test_Score implements Serializable{
	String name;
	int classNum;
	int java, oracle, jsp, web, total;
	double avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java+web+jsp+oracle;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setAverg() {
		this.avg = total / 4;
	}
	public double getAverg() {
		return avg;
	}
	@Override
	public String toString() {
		return "Test_Score | " +classNum+" 반 " +name+ " : java =" + java + ", oracle =" + oracle + ", jsp =" + jsp + ", web =" + web
				+ ", total =" + total + "Avg = "+ avg;
	}
	public Test_Score(String name, int classNum, int[] score) {
		super();
		this.name = name;
		this.java = score[0];
		this.oracle = score[1];
		this.jsp = score[2];
		this.web = score[3];
		this.classNum = classNum;
		setTotal();
		setAverg();
	}
	public Test_Score() {
	}


}

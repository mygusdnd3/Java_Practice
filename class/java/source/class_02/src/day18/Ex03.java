package day18;

/*
 	학생의 
 		이름,java, oracle, web, jsp, total
 	성적을 관리할 프로젝트를 작성하세요.
 	1.
 	단, 클래스를 출력하셤
 	"??? 학생의 성적 : java - xxx, oracle - xxx, web - xxx, jsp - xxx , total -xxx"
 	의 형식으로 출력되게 하세요
 	
 	2. 학생이름이 같으면 같은 학생으로 처리되게 하세요
 */
public class Ex03 {

	static String[] name = {"철수","영희","민희","지수"};
	static int[] java = {55,66,77,88,99};
	static int[] oracle = {25,13,55,66,100};
	static int[] web = {15,62,31,22,21};
	static int[] jsp = {85,31,35,52,59};
	static int[] total ;
	public Ex03() {
		
	}
	

	public static void main(String[] args) {

	ItClass[] itclass = new ItClass[name.length];
	for(int i = 0 ; i < name.length;  i++) {
		
		itclass[i] = new ItClass(name[i],java[i],oracle[i],web[i],jsp[i]);
		
		
	}
	
	for(int i = 0 ; i <itclass.length;i++) {
		System.out.println(itclass[i]);
	}
		
	}	

}

class Name {
	String name;

	public Name() {
	}

	public Name(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name+"학생의 성적";
	}
	

}

class ItClass extends Name{

	int java , oracle, web, jsp, total;
	public ItClass(String name,int java, int oracle, int web, int jsp){
		this.java = java;
		this.oracle = oracle;
		this.web = web;
		this.jsp = jsp;
		this.name = name;
	}
	public void setPoint(int java, int oracle, int web, int jsp){
		
	}
	public String toString() {
		return name+" 학생의 성적 Java :"+java+"| Oracle : "+oracle+"| web : "+web+"| JSP : "+jsp;
	}
	public void equals(String name) {
		if(this.name == name) {
			System.out.println("동명이인이있다");
		}
	}
}




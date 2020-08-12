package day20;

import java.text.MessageFormat;

/*
 	세 사람의 시험 결과를 출력하세요.
 	
 	형식은
 	
 		전은석 - java : 100, oracle : 95 :
 		
 		String[][] data = {
				{ "전은석1", "010-3175-9042", "enus@increpas.com"},
				
		점수는 랜덤하게 만들라고?
 */
public class Ex02 {

	
	public Ex02() {
		MessageFormat form = new MessageFormat("Name : {0}, Java :{1} Oracle : {2}, Web :{3}, Jsp : {4}, Total : {5}");
		
		String[][] data = {
				{"전은석1", "90","90","90","90"},
				{"전은석1", "90","90","90","90"},
				{"전은석1", "90","90","90","90"},
		};
		
	}

	public static void main(String[] args) {

	}

}
class StudClass{
	String name;
	int java,oracle,web,jsp;
	double total;
	public void set(String name, int java,int oracle,int web,int jsp) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.web = web;
		this.jsp = jsp;
	}
	
	public void setTotal() {
		total = java+oracle+web+jsp;
	}
}



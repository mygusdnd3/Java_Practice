package day20;

import java.util.Arrays;
import java.util.Vector;

/*
 	1.
 	Vector 를 만들고
 	이름, 자바, 디비, 웹, jsp, 총점을 저장해서 출력하세요
 	
 	2.
 	3명을 출력하세요?
 */
public class Ex03 {

	public Ex03() {
		Stud2[] std4 = new Stud2[3];
		Vector testV = new Vector();
		for(int i = 0; i < std4.length;i++) {
			std4[i] = new Stud2();
		}
		std4[0].setData("고길동");
		std4[1].setData("두둠칫");
		std4[2].setData("고장남");
		
		
//-------------------------------------------------------------------------------------------------------
		
		Vector vec1 = new Vector();
		Stud std1 = new Stud();
		std1.setData("고길동");
		vec1.add(std1.name);
		vec1.add("JAVA :"+std1.java);
		vec1.add("DB :"+std1.db);
		vec1.add("WEB :"+std1.web);
		vec1.add("Total :"+std1.total);
		
		Vector vec2 = new Vector();
		Stud std2 = new Stud();
		std2.setData("또치");
		vec2.add(std2.name);
		vec2.add("JAVA :"+std2.java);
		vec2.add("DB :"+std2.db);
		vec2.add("WEB :"+std2.web);
		vec2.add("Total :"+std2.total);
		Stud[] std = new Stud[3];
		
		Vector vec3 = new Vector();
		Stud std3 = new Stud();
		std3.setData("마이콜");
		vec3.add(std3.name);
		vec3.add("JAVA :"+std3.java);
		vec3.add("DB :"+std3.db);
		vec3.add("WEB :"+std3.web);
		vec3.add("Total :"+std3.total);
		
		Vector total = new Vector();
		total.addAll(vec1);
		total.addAll(vec2);
		total.addAll(vec3);
		System.out.println("=====================================");
//		 
		for (int i = 0; i <total.size(); i++) {
			
				System.out.print(total.get(i)+" | ");
				if(i!=0 && i==4||i==9) {
					System.out.println();
					
				}
				
			
		}//for문 끝
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
class Stud{
	String name;
	int java, db, web,jsp;
	double total;
	
	public void setData(String name) {
		this.name = name;
		java = (int)(Math.random()*100+1);
		db = (int)(Math.random()*100+1);
		web = (int)(Math.random()*100+1);
		jsp = (int)(Math.random()*100+1);
		setTotal();
	}
	public void setTotal() {
		total = java+db+web+jsp;
	}
	public void addVector() {
		Vector v = new Vector();
		v.add(name);
		v.add(java);
		v.add(db);
		v.add(web);
		v.add(jsp);
		v.add(total);
	}
}
class Stud2{
	String name;
	int java, db, web,jsp;
	double total;
	Vector v = new Vector();
	
	public void setData(String name) {
		this.name = name;
		java = (int)(Math.random()*100+1);
		db = (int)(Math.random()*100+1);
		web = (int)(Math.random()*100+1);
		jsp = (int)(Math.random()*100+1);
		setTotal();
		addVector();
		
	}
	public void setTotal() {
		total = java+db+web+jsp;
	}
	public void addVector() {
		v.add(name);
		v.add(java);
		v.add(db);
		v.add(web);
		v.add(jsp);
		v.add(total);
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+" | ");
		}
	System.out.println("");
	}
	
		
	
}

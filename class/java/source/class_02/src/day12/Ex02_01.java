package day12;


/*
 	 문제 2]
 	 	1.
 	 	1-java , oracle, html, jsp, total 점수를 기억할 클래스를 만들고
 	 	2-학생 한명의 데이터를 입력해서 
 	 	점수는 70~95
 	 	3. 출력함수로 출력
 	 	
 	 	2.
 	 	1-생성자 함수를 오버로딩해서
 	 	2- 4 과목 점수를 입력해서 객체가 만들어지게?하세요
 	 	3- 출력.
 	 	
 	 	3.
 	 	1. 3명데이터를 관리할 배열을 만들어서 입력하고
 	 	2. 출력하세요
 	 	
 	 	
 */

class GuaMouk{
	int java, oracle, html, jsp, total;
	
	public GuaMouk() {
		
	}
	
	public GuaMouk(int java, int oracle, int html, int jsp) {
		setPoint(java, oracle, html, jsp);
	}
	
	public void setPoint(int java, int oracle, int html, int jsp) {
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.jsp = jsp;
		total = setTotal();
	}
	public int setTotal() {
		total =  java+oracle+ html+jsp;
		return total;
	}
	public void toPrint() {
		System.out.println("java   점수 :"+java);
		System.out.println("oracle 점수 :"+oracle);
		System.out.println("html   점수 :"+html);
		System.out.println("jsp    점수 :"+jsp);
		System.out.println("total  점수 :"+total);
		System.out.println("---------------------------------");
	}
	
}

public class Ex02 {
	
	GuaMouk[] gm;
	int[] java, oracle, html, jsp, total;
	
	public Ex02() {
		OnePerson();
		PersonArr();
		// toPrint();
	}
	
	//1-생성자 함수를 오버로딩해서
	 	//2- 4 과목 점수를 입력해서 객체가 만들어지게?하세요
	 	//3- 출력.
	public Ex02(int java, int oracle, int html, int jsp) {
		GuaMouk gm2 = new GuaMouk();
		gm2.setPoint(java, oracle, html, jsp);
		gm2.setTotal();
		gm2.toPrint();
	}
	
	
	//2-학생 한명의 데이터를 입력해서  점수는 70~95
	public void OnePerson() {
		GuaMouk gm = new GuaMouk();
		gm.setPoint(70, 80, 95, 90);
		gm.setTotal();
		System.out.println("********OnePerson*********");
		gm.toPrint();
	}
	
	
	//3.
	// 	1. 3명데이터를 관리할 배열을 만들어서 입력하고
	 //	2. 출력하세요
	 			
	public void setArr(){
		java = new int[] {70,80,90,95};
		oracle = new int[] {75,85,70,95};
		html = new int[] {70,70,90,95};
		jsp = new int[] {75,85,95,95};
	}
	public void PersonArr() {
		setArr();
		GuaMouk[] gmArr = new GuaMouk[java.length];
		for (int i = 0; i < gmArr.length; i++) {
			gmArr[i] = new GuaMouk();
			System.out.println("******"+(i+1)+"번째 ******");
			
			gmArr[i].setPoint(java[i], oracle[i], html[i], jsp[i]);
			gmArr[i].setTotal();
			gmArr[i].toPrint();
		}
		
		
	}
	
	public static void main(String[] args) {
		//new Ex02();
		//new Ex02(75,80,90,95);
		new GuaMouk(75,80,90,95);
	}

}

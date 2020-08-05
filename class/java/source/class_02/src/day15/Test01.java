package day15;

public class Test01 {

	public Test01() {
		//Son s = new Son();
		//Father f = s; // 자동 형변환.
		//Son2 s2 = (Son2)f;//강제 형변환
	/*	Father f3= new Father();
		Son2 s =(Father)f3; 
		
		f = new Son2();
		Father f2 = new Father();
		f2 = new Son();
		*/
		
		Son s = new Son();
		Father f = new Father();
		f.abc(s, s.a);
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class Father{
	int a ;
	
	public void toPrint() {
		System.out.println("ㅇ");
		System.out.println(a);
	}
	public void abc(Father a , int b) {
		this.a = b;
		a.toPrint();
	}
}

class Son extends Father{
	int a = 20;
	
	public void toPrint() {
		System.out.println("son");
	}
}
class Son2 extends Father{
	
}

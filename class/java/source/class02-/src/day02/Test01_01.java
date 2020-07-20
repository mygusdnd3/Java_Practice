package day02;

class Test01_0 {
	Test01_0(){
	}
	void shout(){
		System.out.println("Test01");	
	}
	
}



public class Test01_01 {//접근 지정자를 붙여주세요 메인앞에는)
	public static void main(String[] args) {
		System.out.println("Test01_01");
		Test01_0 t = new Test01_0();
		t.shout();
	}
}
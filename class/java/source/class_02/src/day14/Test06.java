package day14;

public class Test06 /*extends String*/ {

	public Test06() {
		Test06_02 t1 = new Test06_02();
		t1.abc();
	}

	public static void main(String[] args) {
		new Test06();
	}

}

class Test06_01{
	final void abc() {	// 이 함수는 오버라이드가 안되는 함수
		System.out.println("전은석 선생님 최고!");
	}
}

class Test06_02 extends Test06_01{
	
	
	/*	상위 클래스의 abc() 의 속성이 final이기 때문에
	    더이상 이 함수는 오버라이드(재정의) 할수 없는 함수입니다.
	 
	void abc() {
		System.out.println("그짓말!");
	}
	
	*/
}
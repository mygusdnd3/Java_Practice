package day15;

public class Test02 {

	public Test02() {
//		Sub1의 abc()가 실행되야 할 경우
//		Sub1 s2 = new Sub1();
//		xyz(s2);		//Maintest t = s1;
		xyz(new Sub1());
		
//		Sub2의 abc()가 실행되야 할 경우
		Sub2 s2 = new Sub2();
		xyz(s2);		//Maintest t = s1;
		
//		Sub3의 abc()가 실행되야 할 경우
		Sub3 s3 = new Sub3();
		xyz(s3);		//Maintest t = s1;
		
		System.out.println("************");
		MainTest f = new MainTest();
		//f = (MainTest)s2;
		//s2 = (Sub2)f;
		f.abc();
		System.out.println(f);
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	public void xyz(MainTest t) {
		t.abc();
	}

}

class MainTest{
	int a = 10;
	//오버라이딩할 함수가 필요하다 !! 아래는 고쳐쓴다.
	public void abc() {
		System.out.println("여기는 메인");
	}
}

class Sub1 extends MainTest{
	public void abc() {
		System.out.println("여기는 Sub1");
	}
}
class Sub2 extends MainTest{
	int a = 20;
	public void abc() {
		System.out.println("여기는 Sub2");
	}
}
class Sub3 extends MainTest{
	public void abc() {
		System.out.println("여기는 Sub3");
	}
}


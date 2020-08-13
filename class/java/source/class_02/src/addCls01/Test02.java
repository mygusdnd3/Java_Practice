package addCls01;

public class Test02 {

	public Test02() {
		Test02_02 t2 = new Test02_02();
		t2.abc();
		System.out.println("t2.num"+t2.num);
		Test02_01 t1 = new Test02_01();
		System.out.println("t1.num"+t1.num);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
class Test02_01{
	int num = 10;
	void abc() {
		System.out.println("Test02_01.abc()");
	}
}

//Test02_01 을 상속받은 클래스 Test02_02

class Test02_02 extends Test02_01{
	int num = 999;
	void xyz() {
		System.out.println("PI 값은 :"+Math.PI);
	}
	@Override
	void abc() {
		System.out.println("Test02_02.abc() - Override 됨...");
	}
	
}

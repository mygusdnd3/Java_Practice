package day15;

public class Test06 {

	public Test06() {
		System.out.println(Inter01.num);
		Inter01 t1 = new Test06_01();
		t1.display();
	}

	public static void main(String[] args) {
		new Test06();
	}

}

class Test06_01 implements Inter01{
	@Override
	public void display() {
		System.out.println("Inter01을 구현한 TEST06_01 클래스");
	}
}

package day14;

public class Test08 {

	public Test08() {
		Object obj = new Test08_01();
		((Test08_01) obj).abc(); // 실제 쓸수있는 타입으로 형변환
	}
	
	public static void main(String[] args) {
		new Test08();
	}
}

class Test08_01	/*extends Object*/{// 안써도 당연하다 자동생략
	public void abc() {
		System.out.println(" 이 클래스는 TEST08_01");
	}
}

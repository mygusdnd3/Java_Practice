package day11;

public class Test03_01 {

	
	public Test03_01() {
		//III
		// Circle01 데이터 세개를 만들어 보자.
		Circle01 c01 = new Circle01();
		// c01이라는 원의 반지름을 출력해 보자.
		System.out.println("1. c01 의 반지름 : "+c01.rad);
		System.out.println("1. c01 의 원둘레 : "+c01.arround);
		
		// 반지름을 입력해보자.
		
		c01.rad = 10;
		// c01이라는 원의 반지름을 출력해 보자.
		System.out.println("2. c01 의 반지름 : "+c01.rad);
		System.out.println("2. c01 의 원둘레 : "+c01.arround);
		
		System.out.println("------------------------------------------------");
		
		// 함수를 통해서 모든 변수의 데이터를 셋팅해보자.
		c01.setRad(7);
		// c01이라는 원의 반지름을 출력해 보자.
		System.out.println("3. c01 의 반지름 : "+c01.rad);
		System.out.println("3. c01 의 원둘레 : "+c01.arround);
	//IV 
		
		
		// 두번재 원을 만들어서 반지름을 3으로 하는 원으로 셋팅하자.
		
		Circle01 c02 = new Circle01();
		// 반지름을 입력하면서 데이터셋팅..
		c02.setRad(3);
		// c02이라는 원의 반지름을 출력해 보자.
		System.out.println("4. c02 의 반지름 : "+c02.rad);
		System.out.println("4. c02 의 원둘레 : "+c02.arround);
		// 반지름이 15인 원을 만든다.
		Circle01 c03 = new Circle01();
		c03.setRad(15);
		// c03이라는 원의 반지름을 출력해 보자.
		System.out.println("5. c03 의 반지름 : "+c03.rad);
		System.out.println("5. c03 의 원둘레 : "+c03.arround);
		
		
		
	}
	public static void main(String[] args) {
		
		// I
		new Test03_01();
		System.out.println("NONE");
		// II
		
	}
			// 실행 순서 : I --> III ----> IV --->II
}

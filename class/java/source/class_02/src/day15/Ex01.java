package day15;

/*
 	문제 1]
 		랜덤하게 숫자를 발생시켜서
 		숫자가 홀수이면	Odd01
 			"홀수 클래스" //display함수안에서
 		짝수이면	Event01
 			"짝수 클래스"
 		출력이 되도록
 		
 		Type01 클래스를 상속받은 클래스를 각각 정의하고
 		함수를 오버라이드 처리하세요.
 */
public class Ex01 {

	public Ex01() {
		Type01 t01;
	//	for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 10 + 1 - 1) + 1;
			System.out.println(" 당첨된 숫자 : " + num);
			Type01 t = num %2 !=0 ? new Odd01() : new Even01();
			if (num % 2 == 0) {
				t01 = new Even01();
				t01.display();
	 		} else {
				t01 = new Odd01();
				t01.display();
			}
			// t01.display()를 요따가넣으면 한번에
		}
	//}

	public static void main(String[] args) {
		new Ex01();
	}

}

abstract class Type01 {
	public abstract void display();

}

class Odd01 extends Type01 {

	@Override
	public void display() {
		System.out.println(" 홀수 클래스 ");
	}

}

class Even01 extends Type01 {

	@Override
	public void display() {
		System.out.println(" 짝수 클래스 ");
	}

}

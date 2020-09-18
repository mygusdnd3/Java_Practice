package day13;

/*
 	문제 2]
 		Figure 클래스를 만들고
 			class Figure{
 				double getArea(){
 					return 0.0;
 				}
 				public String toString(){
 					return "이것은 도형입니다.";
 				}
 			}
 			
 			이 클래스를 상속 받아서 Sagak, Semo, Dongle 클래스를 만들어서
 			
 			각 도형의 내용을 출력하세요.
 */
<<<<<<< HEAD

import static java.lang.Math.*; //static의 멤버를 임포트 하는 방법

public class Ex02 {
	
	public Ex02() {
		int[] cnt = new int[10];
		for (int i = 0; i < cnt.length; i++) {
			cnt[i] = (int) (Math.random() * 11);
		}
		// Figure 배열을 만든다.

		Figure[] fg = new Figure[10];
		for (int i = 0; i < fg.length; i++) {
			int no1 = (int) (random() * 13 + 3);
			System.out.println(no1);
			if (cnt[i] % 3 == 0) {
				fg[i] = new Dongle(no1);
			} else if (cnt[i] % 3 == 1) {
				int no2 = (int) (random() * 13 + 3);
				fg[i] = new Semo(no1, no2);

			} else {
				int no2 = (int) (random() * 13 + 3);
				fg[i] = new Sagak(no1, no2);
			}
		}
//		for(Figure f : fg) {
//			System.out.println(f);
//		}
=======
public class Ex02 {

	public Ex02() {
		Sagak sa = new Sagak();
		Semo semo = new Semo();
		Dongle dongle = new Dongle();

		int[] rand = new int[6];
		int[] rand2 = new int[6];
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 12);
			rand2[i] = (int) (Math.random() * 12);
			
			System.out.println(sa.getArea(rand[i], rand2[i]));
			System.out.println(semo.getArea(rand[i]/2,rand2[i]/2));
			System.out.println(dongle.getArea(rand[i]));
			
			System.out.println(dongle);
		}

		

		

		
>>>>>>> 0b0395a496390f23efad4e87f95ccd1d88fd0ae5

	}

	public static void main(String[] args) {
		new Ex02();
	}
}

class Figure {
	double getArea() {
		return 0.0;
	}

	public String toString() {
		return "이것은 도형입니다.";
	}
}

class Sagak extends Figure {
<<<<<<< HEAD
	int width, height;
	double area;

	public Sagak() {
		this(1, 1); // 오버라이딩 된 다른함수를 호출
		// 원칙은 this.Sagak(1,1) 호출해야 하지만 생성자 함수는
		// 일반함수처럼 호출할수 없다.
	}

	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		area = getArea();
	}

	public double getArea() { // 매개변수까지 동일하게 써라..
		// 오버라이딩은 같거나 넓은방향의 접근지정자

		// 1.함수의 원형은 유지한다. 함수의 원형 = 반환타입 함수이름 매개변수
		// 2.접근지정자는 같거나 넓은방향으로 한다.
		return height * width;
	}

	public String toString() {
		return "이 도형은 가로가 " + width + " 이고 세로가 " + height + "이며" + "넓이가 " + area + " 인 사각형입니다";
=======
	public Sagak() {

	}

	double getArea(int hight, int bottom) {
		return hight * bottom;
	}

	public String toString() {
		return "이것은 사각형입니다";
>>>>>>> 0b0395a496390f23efad4e87f95ccd1d88fd0ae5

	}
}
//System.out.println("삼각형의 넓이는 : " + hight * bottom * 0.5);
//System.out.println("사각형의 넓이는 : " + hight * bottom);
//면적 계산해서 대입해주는 함수
//area = rad * rad * PI

class Semo extends Figure {
<<<<<<< HEAD
	int width, height;
	double area;

	public Semo() {
		this(1, 1);
	}

	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		area = getArea();
	}

	double getArea() {

		return height * width * 0.5;
	}

	public String toString() {
		return "이 도형은 가로가 " + width + " 이고 세로가 " + height + "이며" + "넓이가 " + area + " 인 삼각형입니다";

=======
	public Semo() {

	}

	double getArea(int hight, int bottom) {

		return hight * bottom * 0.5;
	}

	public String toString() {
		return "이것은 삼각형입니다";
>>>>>>> 0b0395a496390f23efad4e87f95ccd1d88fd0ae5
	}
}

class Dongle extends Figure {
<<<<<<< HEAD
	int rad;

	double arround, area;

	public Dongle() {
		this(1);
	}

	public Dongle(int rad) {
		this.rad = rad;
		area = getArea();
		setArround();
=======
	public Dongle() {

>>>>>>> 0b0395a496390f23efad4e87f95ccd1d88fd0ae5
	}

	double getArea(int rad) {
		return rad * rad * Math.PI;
	}

<<<<<<< HEAD
	public double getArea() {
		return rad * rad * 3.14;
	}

	// 둘레 변수에 초기화 해주는 함수
	public void setArround() {
		arround = 2 * rad * 3.14;
	}

	public String toString() {
		return "이 도형은 반지름이 " + rad + " 이고 둘레가 " + arround + "이며" + "넓이가 " + area + " 인 원입니다";

=======
	public String toString() {
		return "이것은 원형입니다";
>>>>>>> 0b0395a496390f23efad4e87f95ccd1d88fd0ae5
	}
}

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
	public Sagak() {

	}

	double getArea(int hight, int bottom) {
		return hight * bottom;
	}

	public String toString() {
		return "이것은 사각형입니다";

	}
}
//System.out.println("삼각형의 넓이는 : " + hight * bottom * 0.5);
//System.out.println("사각형의 넓이는 : " + hight * bottom);
//면적 계산해서 대입해주는 함수
//area = rad * rad * PI

class Semo extends Figure {
	public Semo() {

	}

	double getArea(int hight, int bottom) {

		return hight * bottom * 0.5;
	}

	public String toString() {
		return "이것은 삼각형입니다";
	}
}

class Dongle extends Figure {
	public Dongle() {

	}

	double getArea(int rad) {
		return rad * rad * Math.PI;
	}

	public String toString() {
		return "이것은 원형입니다";
	}
}

package day14;


public class Test02 {

	public Test02() {
		Figure f1 = new Figure();
		Figure f2 = new Sagak();	//자동 형변환
		Sagak s1 = new Sagak();
		Semo s2 = new Semo();
		Dongle d1 = new Dongle();
		
		System.out.println(s1 instanceof Sagak);
		System.out.println(s2 instanceof Figure); //Figure > Sagak
		System.out.println((Figure)s1 instanceof Semo);
		
	}

	public static void main(String[] args) {
		new Test02();
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

	}
}
//System.out.println("삼각형의 넓이는 : " + hight * bottom * 0.5);
//System.out.println("사각형의 넓이는 : " + hight * bottom);
//면적 계산해서 대입해주는 함수
//area = rad * rad * PI

class Semo extends Figure {
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

	}
}

class Dongle extends Figure {
	int rad;

	double arround, area;

	public Dongle() {
		this(1);
	}

	public Dongle(int rad) {
		this.rad = rad;
		area = getArea();
		setArround();
	}

	double getArea(int rad) {
		return rad * rad * Math.PI;
	}

	public double getArea() {
		return rad * rad * 3.14;
	}

	// 둘레 변수에 초기화 해주는 함수
	public void setArround() {
		arround = 2 * rad * 3.14;
	}

	public String toString() {
		return "이 도형은 반지름이 " + rad + " 이고 둘레가 " + arround + "이며" + "넓이가 " + area + " 인 원입니다";

	}
}

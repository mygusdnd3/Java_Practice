package day15;

/*
 	문제 2]
 		Dohyung 인터페이스를 구현한
 		Sagak
 		Samgak
 		Won
 		클래스를 구현하고
 		랜덤하게 0~ 15까지 숫자를 발생 시켜
 		3으로 나눈 나머지가 0이면 Won
 		1이면 SamGak
 		2면 Sagak
 		을 만들고
 		
 		Dohyung 배열에 10개 채우고 출력하세요
 		생성자 함수 만들고 객체화할때 랜덤하게 들어가게 하면될듯
 */
public class Test07 {

	public Test07() {
		Dohyng[] t1 = new Dohyng[10];

		for (int i = 0; i < 10; i++) {
			int rdn = (int) (Math.random() * 15 + 0 - 1) + 1;
			int rdn2 = (int) (Math.random() * 15 + 0 - 1) + 1;
			if (rdn % 3 == 0) {
				t1[i] = new Sagak(rdn, rdn2);
			} else if (rdn % 3 == 1) {
				t1[i] = new Samgak(rdn, rdn2);
			} else if (rdn % 3 == 2) {
				t1[i] = new Won(rdn);
			}
		} // for문 끝
		for (Dohyng d : t1) {
			d.display();
		}

	}

	public static void main(String[] args) {
		new Test07();
	}

}

class Sagak implements Dohyng {
	int width, height;
	int area;

	public Sagak() {
	}

	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		area = width * height;
	}

	@Override
	public void display() {
		// System.out.println("삼각형의 밑변은 : " + width + "| 높이는 : "+height+" 이고 |넓이는 :
		// "+area +" 입니다.");
		System.out.printf("삼각형의 밑변은 [%3d], 높이는 [%3d] \t넓이는 [%3d] 입니다\n", width, height, area);
	}

}

class Samgak implements Dohyng {
	int width, height;
	double area;

	public Samgak() {
	}

	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		area = width * height / 2.0;
	}

	@Override
	public void display() {
		// System.out.println("사각형의 가로는 : " + width + "| 세로는 : "+height+" 이고 |넓이는 :
		// "+area +" 입니다.");
		System.out.printf("사각형의 가로는 [%3d], 세로는 [%3d] \t넓이는 [%.2f] 입니다\n", width, height, area);
	}

}

class Won implements Dohyng {
	int rad;
	double arround, area;

	public Won() {
	}

	public Won(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}

	public void setArround() {
		arround = Math.round(2 * rad * Math.PI * 100) / 100.0;
	}

	@Override
	public void setArea() {
		area = Math.round(rad * rad * Math.PI * 100) / 100.0;
	}

	@Override
	public void display() {
		// System.out.println("원의 반지름은 : " + rad + "| 둘레는 : "+arround+" 이고 |넓이는 : "+area
		// +" 입니다.");
		System.out.printf("원의   반지름은 [%3d], 높이는 [%.2f] \t넓이는 [%.2f] 입니다\n", rad, arround, area);
	}

}

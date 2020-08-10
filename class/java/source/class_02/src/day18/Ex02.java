package day18;
/*
 	삼각형 클래스를 만드는데
 	삼각형의 밑변이 같으면 같은 삼각형이 되도록 정의하고
 	밑변 높이를 1~20 사이의 정수로 랜덤하게 만들어서
 	삼각형 두개를 만들고
 	만들어진 삼각형들을 비교해서
 	같은지 여부를 출력하세요.
 	
 	단, 3보다 작은 숫자가 발생하면
 	사용자 정의 예외를 만들어 처리하세요
 	15보다 큰 숫자는 NumberFormatException 으로 처리하셍
 	
 	클래스를 출력하면 클래스 내용이 출력되게 함수를 오버라이드 하세요.
 */



public class Ex02 {

	public Ex02() {
	}

	public static void main(String[] args) {
		Samgak[] samgak = new Samgak[2];
		
		
		OverScore os = new OverScore();
		for(int i = 0 ; i <2; i ++) {
		int height = (int) (Math.random() * 20 - 1 + 1) + 1;
		int bottom = (int) (Math.random() * 20 - 1 + 1) + 1;
		
		try {
			if (height <= 3 || bottom <= 3) {
				throw new MyExcept();
			}
		} catch (MyExcept e) {
			System.out.println(e.toString());
		}

		try {
			if (height > 15 || bottom > 15) {
				os.MyOverScore();
			}
		} catch (NumberFormatException e) {

			System.out.println(e.toString());
		}
		
		samgak[i] = new Samgak(height,bottom);
		}
		
		System.out.println(samgak[0].equals(samgak[1]));

	}

}

class OverScore {
	public void MyOverScore() throws NumberFormatException {

		throw new NumberFormatException();

	}
}

class MyExcept extends Exception {
	public String toString() {
		return "3이하의 숫자가 발생하였습니다.";
	}
}

class Samgak {
	int height, bottom;
	double area;

	public Samgak() {
	}
	public Samgak(int height, int bottom) {
		this.height = height;
		this.bottom = bottom;
	}

	public void setArea(int height, int bottom) {
		this.height = height;
		this.bottom = bottom;
	}

	@Override
	public boolean equals(Object o) {
		boolean bool = false;

		Samgak s = (Samgak) o;
		if (this.bottom == s.bottom) {
			bool = true;
		}
		return bool;

	}

}


package day13;

import java.util.Arrays;

/*
	문제 1]
	
		0~10 사이의 수를 랜덤하게 10개 발생시켜서
		홀수가 나오면 정사각형 (Square),
		짝수가 나오면 (Rectangle)
		을 만들어서 Nemo 타입의 배열에 입력하고
		하나씩 꺼내서 출력하세요
*/
public class Test08 {

	public Test08() {
		Square nemo1 = new Square(5);
		Rectangle nemo2 = new Rectangle(10,5);
		
		
		
		
		
		
		
		Nemo n1 = nemo1;
		Nemo n2 = nemo2;
		
		Nemo[] nemo = new Nemo[10];
		int[] nArr = new int[10];
		for(int i = 0 ; i < nArr.length; i++) {
			int cnt = (int)(Math.random()*11);
			
			int rand =(int)(Math.random()*11);	
			
			if(cnt % 2 == 0) {
//			if(rand != 0 && rand % 2 == 0 && rand2 != 0 && rand2 % 2 == 0 ) {
				int rand2 =(int)(Math.random()*11);
				nemo[i] = new Rectangle(rand,rand2);
			} else {
				nemo[i] = new Square(rand);
			}			
		
		}
		
		for(Nemo n : nemo) {
			
			n.toPrint();
		}
		/*
		nemo1.toPrint();
		System.out.println();
		nemo2.toPrint();
		*/
				//
		/*
		System.out.println();
		n1.toPrint();
		System.out.println();
		n2.toPrint();
		*/
		/*
		Nemo[] nArr = {n1, n2};
		for(int i = 0; i < nArr.length;i++) {
			nArr[i].toPrint();		//함수는 인스턴스쪽에 정의도어있는걸 가져다 쓴다.
		}
		*/
	}

	public static void main(String[] args) {
		new Test08();
	}

}

class Nemo {
	public void toPrint() {
		System.out.println("이것은 네모입니다.");
	}
}

class Square extends Nemo {	//정사각형 // Nemo n1 = new Square(7);
	int size;
	int area;

	public Square() {}
	public Square(int size) {
		this.size = size;
		area = size * size;
	}
	// toPrint() 오버라이딩한다.(재정의한다.)
	public void toPrint() {
		System.out.printf("이 사각형은 가로가  세로가 %4d이고 넓이가 %8d인 정사각형 입니다.\n"

				, size, area);
	}
}

class Rectangle extends Nemo {	//직사각형
	int width;
	int height;
	int area;

	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		area = width * height;
		
	}
	// toPrint() 오버라이딩한다.(재정의한다.)
	public void toPrint() {
		System.out.printf("이 사각형은 가로가 %4d 이고, 세로가 %4d이고 넓이가 %8d인 직사각형 입니다.\n"

				, width, height, area);

	}
}
package day02;

import java.util.Scanner;

public class Ex_Test_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문제 1번");
		System.out.println("삼각형과 사각형의 넓이를 구합니다.");
		System.out.println("높이를 입력하세요");
		int hight = sc.nextInt();
		System.out.println("밑변을 입력하세요");
		int bottom = sc.nextInt();
		System.out.println("삼각형의 넓이는 : " + hight * bottom * 0.5);
		System.out.println("사각형의 넓이는 : " + hight * bottom);

//		
	}

}

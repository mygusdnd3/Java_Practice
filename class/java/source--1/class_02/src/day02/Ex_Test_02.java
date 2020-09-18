package day02;

import java.util.Scanner;

public class Ex_Test_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원 넓이와 둘레를 구합니다");
		System.out.println("반지름을 입력하세요");
		double ban = sc.nextDouble();
		System.out.println("원의 넓이는 :" + ban * ban * Math.PI);
		System.out.println("원의 둘레는 :" + ban * 2 * Math.PI);

	}

}

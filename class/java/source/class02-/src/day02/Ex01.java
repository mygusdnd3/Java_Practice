package day02;
/*
 *   1. 두개의 숫자를 입력받은 후
 *   	두 수를 이용해서 사각형, 삼각형의 넓이를 구해서
 *   	출력해주는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex01 {
	int no1 = 10;

	// static이 붙지 않으면 객체생성해서 사용
	public static void main(String[] args) {
		System.out.println("no1 : " + new Ex01().no1);

		// 시작
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 첫번째 숫자 입력받을 메세지 출력
		System.out.print("첫반째 숫자를 입력하세요! :");
		// 입력받아서 변수에 저장
		int num1 = sc.nextInt();

		// 두번째 숫자 입력받을 메세지 출력
		System.out.print("두번재 숫자를 입력하세요! :");

		// 두번째 숫자 변수에 저장
		int num2 = sc.nextInt();

		// 계산할 도형 입력받을 메세지 출력
		System.out.print("삼각형은 3, 사각형은 4를 입력하세요 :");
		// 입력값 변수에 저장
		int type = sc.nextInt();

		int calc = num1 * num2;

		if (type == 3) {
			System.out.printf("입력받은 %3s 의 \t밑변은 %3d 이고 높이는 %3d 이고 \n넓이는 %6.2f입니다", "삼각형", num1, num2, calc / 2f);
		}

		if (type == 4) {
			System.out.printf("입력받은 %3s 의 \t밑변은 %3d 이고 높이는 %3d 이고 \n넓이는 %6.2f입니다", "사각형", num1, num2, (float)calc);
		}

	}
}

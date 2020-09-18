package day03;
/*
 * 	문제]
 * 		두 수를 입력받아서 각각 변수에 담고
 * 		첫 번째 수가 두번째 수 보다 크면 "양수"
 * 		첫 번째 수가 두번째 수 보다 작으면 "음수"
 * 		를 출력하세요.
 * 
 * 		삼항 연산자를 사용해서 처리하세요
 */

import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		System.out.println("두 수의 값 비교");
		System.out.print("첫 번째 수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.println((a>=b)?"양수":"음수");
	}
}

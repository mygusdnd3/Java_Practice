package day03;

import java.util.Scanner;

/*
 	삼항 연산자 문제
 		문제 3 ]
 			정수 3개를 입력 받아서
 			제일 큰 수 부터 출력하세요. 
 			
 	힌트 ]
 		조건은 반드시 true false
 		삼항 연산자도 중첩해서 사용할 수 있습니다.
 		() ? 참이면 (삼항연산자) :(삼항연산자);
 */


public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받은 정수의 결과를 큰 수부터 출력");
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int c = sc.nextInt();
		
		int test= (a>b)?(a>c)?a:b:c;
		int test2= (a<b)?(b>c)?a:b:c;
		int test3= (c>a)?(c>b)?a:b:c;
		
		System.out.printf("큰 수의 나열 %d %d %d",test,test2,test3);
		
		
		//int result1 = (test>test2)?(test2>test3)?test:test2:test3;
		
		
//		System.out.println(test);
//		System.out.println(test2);
//		System.out.println(test3);
//		System.out.println(result1);
//////		(test>=test2)?test:test2+test
//		System.out.println((test>test2)?(test2>test3)?test:test2:test3
//				);
				
	}
}

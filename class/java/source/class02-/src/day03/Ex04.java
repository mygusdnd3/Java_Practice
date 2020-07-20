package day03;

import java.util.Scanner;

/*
 	년 수를 입력 받아서
 	그 해가 윤년인지 평년인지 판별해서 출력하세요
 	
 	참고]
 		윤년 : 4로 나누어 떨어지고 100으로 나누어 떨어지면 안되고,    
 			   400으로 떨어지는 해는 윤년
 			   
 			   
 			   if(a/4==0){
 			   	if(a/100!=0){
 			   	 if(a/400=
 			   
 			   
 		1300년 : 평년
 		1200년 : 윤년
 		
 				조건은 반드시 true false
 		삼항 연산자도 중첩해서 사용할 수 있습니다.
 		() ? 참이면 (삼항연산자) :(삼항연산자);
 */
public class Ex04 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("윤년계산기입니다.");
			System.out.print("알고싶은 해당 년수를 입력하세요 : ");
			int a = sc.nextInt();
			int b;
			int c;
//			System.out.println((a%=0)?(a%=0)?(a%=!0)?a:b:c);
			//
			//4로 나누어 떨어지는가?
			int test1 = a%4;
			
			int test2 = a % 400;
			int test3 = a % 100;
			System.out.println(test1);
			System.out.println(test2);
			System.out.println(test3);
			System.out.println((1<2)?"참":"거짓");
			//int test3= (c>a)?(c>b)?a:b:c;
			//System.out.println((test1=0)?(test2=0)?(test3!=0)?"1":"2");
//			
		
	}
}

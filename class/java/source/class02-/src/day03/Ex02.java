package day03;
/*
 * 	문제 2]
 * 		삼항 연산자 문제 
 * 
 * 		세자리 숫자를 입력 받아서 
 * 		그 수가 300보다 크면 "300보다 큰수"
 * 		작으면 "300보다 작은수"
 * 		가 출력되게 하세요
 */
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("세자리 숫자를 입력하세요");
		System.out.print("첫 번째 숫자");
		a = sc.nextInt();
		System.out.print("두 번째 숫자");
		b = sc.nextInt();
		System.out.print("세 번째 숫자");
		c = sc.nextInt();
		
		System.out.println((a+b+c>300)?"300보다 큰수": "300보다 작은수");
		
		
		
	}
}

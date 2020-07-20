package day03;

import java.util.Scanner;

/*
 * 	문제 5]
 * 		알파벳 문자를 임의로 입력한 후 그 문자가
 * 		대문자이면 소문자로 변환하고,
 * 		소문자면 대문자로 변환하여 출력,
 * 		특수문자면 그냥 출력 프로그램을 작성하세요
 * 	참고 ]
 *		'A' : 65
 *		'a' : 97   32차이
 *		int cha = 'a' - 'A';
 *	참고 ] 
 *		대문자인 경우
 *			ch >= 'A'
 *			ch <= 'Z'
 *		소문자인 경우
 *			ch >= 'a'&
 *			ch <= 'z'
 *	참고]
 *		nextLine() 으로 꺼내오면 문자열로 꺼내오게된다.
 *		이때 문자만 입력하더라도 문자열로 꺼내오게된다.
 *
 *		문자열만 꺼내는방법
 *			문자열.charAt(0)
 */
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//()?():()
		 System.out.println("영어를 입력하세요 : ");
		String strDump = sc.nextLine();
		char str = strDump.charAt(0);
		sc.close();
		int output1 = ((str>='A')&&(str<='Z'))?(str+32):
					  ((str>='a')&&(str<='z'))?(str-32):str;
		System.out.println((char)output1);
	}
}

package day08;

import java.util.Arrays;

/*
 * 
 * 문제 2]

  * 		"Hong Gil Dong" 이라는 문자열을 한 글자씩 꺼내서 출력하세요
 * 		단, 꺼내는 함수는 substring() 을 이용해서 ㅊㅓ리하세요
 * 
 * 	
 * 
 * 	bonus ] 
 * 문자 배열로 만들어 출력하세요
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		String name = "Hong Gil Dong";
		char[] c = name.toCharArray();
		for(int i =0; i <c.length ; i ++) {
			System.out.print(c[i] + " : ");
		}
		*/
		
		String name = "Hong Gil Dong";
		//char[] c = name.toCharArray();
		
		String[] s = new String[name.length()];
		//"Hong Gil Dong" 이라는 문자열을 한 글자씩 꺼내서 출력하세
		System.out.println("한글자씩 꺼내서 출력");
		for(int i = 0 ; i<name.length();i++) {
			 			
			s[i] = name.substring(i,i+1);
			 System.out.print(s[i]+" | ");
			 
		}
		System.out.println();
		String ss = " ";
		
		for(int i = 0; i<s.length;i++) {
			ss+=s[i];
		}
		System.out.println("문자배열로 변환");
		System.out.println("*******");
		
		char[] c = ss.toCharArray();
		for(char cArr : c) {
			System.out.print(cArr);
		}
		
		
					//문자 배열로 만들어 출력하세요
		/*for(int i = 0; i<s.length;i++) {
			c[i] = (char)s[i];	
		}
		System.out.println("----------");
		System.out.println(c);
		
		*/
		

	}

}

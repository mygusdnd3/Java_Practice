package day04;
/*
 * 윈도우 창을 띄워서 입력 받는 방버
 * 		라이브러리를 추가한다
 * 		import javax.swing.*;
 * 
 * 문제 3]
 * 		다섯자리 숫자를 입력 받아서 그 숫자가 
 * 		회문수 인지 아닌지 판별해서 출력하세요
 * 
 * 		참고]
 * 			회문수란 앞으로 보나 뒤로보나 똑같다
 * 		12321 :회문수
 *  	12312 :회문수가 아니다
 */

import javax.swing.*;
public class EX03 {

	public static void main(String[] args) {
//		String str = "12345";
//		char c0 = str.charAt(0);
//		char c1 = str.charAt(1);
//		char c2 = str.charAt(2);
//		char c3 = str.charAt(3);
//		char c4 = str.charAt(4);
//		
//		System.out.println(c0==c0);
//		//String result = (c0)
//
//		int num = Integer.parseInt(str);
//		System.out.println(num);
//		
//		int tmp = num %10;
		
		// 숫자 입력 받고
		String snum = JOptionPane.showInputDialog("다섯자리 숫자를 입력하세요");
		
		char ch0 = snum.charAt(0);
		char ch1 = snum.charAt(1);
		char ch3 = snum.charAt(3);
		char ch4 = snum.charAt(4);
		String str = (ch0 == ch4)?(ch1 == ch3? "회문수+이다.":"회문수가 아니다."):"회문수가 아니다.";
		
		JOptionPane.showMessageDialog(null, "입력한 숫자 "+snum+"은"+str);
		 

	}

}

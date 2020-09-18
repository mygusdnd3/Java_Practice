package day05;

import javax.swing.*;
public class Ex02_02 {
	public static void main(String[] args) {
		
		String sno = JOptionPane.showInputDialog("숫자");
		//반복문으로 하나씩 문자를 꺼내서 비교한다.
		//먼저 변수를 만들어서 초기화 해둔다.
		 //12321
		boolean bool = true;
		for(int i = 0; i<sno.length();i++) {
			char ch1 = sno.charAt(i); //1
			char ch2 = sno.charAt(sno.length() -1 -i);//sno.length는 길이숫자  //
			//마지막 인덱스는 들어가있는값보다 한칸앞
			System.out.println(sno.charAt(sno.length() -1 ));
			System.out.println(i+"i인덱스");
			
			// 12345 기준
			//0-1/1-2/2-3/3-4/4-5/
			if(ch1 != ch2) {
				// 반복문이 중지된 경우 bool 변수 값을 변경.
				bool = false;
				break;
			}
		}
		
		// 이제 변수의 내용을 확인해서 판별하면 된다.
		String result = "회문수가 아니다.";
		if(bool) {
			result ="회문수이다.";
		}
		
		JOptionPane.showMessageDialog(null, "입력한 숫자 " +sno +" 는 "+result);
		
		/*
		 * 	flag 기법 
		 * 		: 프로그램을 실행하다 보면
		 * 		  두가지 이상의 경우가 발생되는 순간이 존재한다.
		 * 		  그 후 어떤 경우가 발생했는지 확인하는 기법.
		 * 
		 */
//		int sum = 0;
//		boolean bool = true;
//		for (int i = 0; i < 10; i++) {
//			if ((i + 1) % 5 == 0) {
//				bool = false;
//				break;
//			}
//			sum += i + 1;
//		}
//		System.out.println(sum);
//		if (bool == true) {
//			System.out.println("반복문 완벽 실행");
//
//		} else {
//			System.out.println("반복문 중간에 건너뛴 경우");
//		}

	}
}

package day08;

import java.util.Arrays;

/*
 *  문제 1]
 *  
 *  	대문자 10개를 랜덤하게 발생해서 출력하는 프로그램을 작성하세요.
 *  	단, 중복 문자는 없어야 한다.
 *  
 * 	bonus]
 * 		정렬해서 출력하세요.
 */
public class Ex01 {

	public static void main(String[] args) {

		char[] alpha = new char[10];
		loop: 
			for (int i = 0; i < alpha.length; i++) {
			/*
			 * Math.random() 으로 랜덤한 수 만들기
			 * 
			 * (int) (Math.random() * (큰수 - 작은수 + 1) + 작은수)
			 */
			int alph = (int) (Math.random() * ('Z' - 'A' + 1) + 'A');

			for (int j = 0; j < i; j++) {
				if (alpha[j] == alph) {
					i--;
					continue loop;
				}
				alpha[i] = (char) alph;
			}

		}
		System.out.println("*** 랜덤 대문자 출력 ***");
		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i]);
		}
		System.out.println();
		System.out.println("*** 내림차순으로 정렬 ***");
		for (int i = 0; i < alpha.length-1; i++) {
			for (int j = 0; j < i; j++)
				if (alpha[i] > alpha[j]) {
					char tmp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = tmp;

				}

		}
		
		}
	

	}

}

package day07;

import java.util.Arrays;

/*
 * 문제 1]
 * 	'A' ~'J' 대문자를 랜덤하게 100개 발생시켜서
 * 	각 문자가 몇번씩 발생되는지 
 * 	그래프 형태로 출력하세요
 * 
 * 	예]
 * 		
 * 		A(5) : *****
 * 		B(3) : ***
 * 	힌트 ]
 * 		각 문자의 카운트를 기억할 배열을 만듭니다.
 * 		랜덤하게 발생시킨 문자가 나올때 마다 해당 문자의 카운트만 1증가
 * int[] count = new int[10]
 */
public class Ex01 {

	public static void main(String[] args) {

		// char ran ;
		int[] count = new int[10];
		int cntA = 0;
		int cntB = 1;
		int cntC = 0;
		int cntD = 0;
		int cntE = 0;
		int cntF = 0;
		int cntG = 0;
		int cntH = 0;
		int cntI = 0;
		int cntJ = 0;

// (char)(Math.random() * ('Z' - 'A' +1)+'A')
//		for (int i = 0; i < 100; i++) {
//			String ran = (String) (Math.random() * ('J' - 'A' + 1) + 'A');
//			// System.out.print(ran+ "|");
//			if (ran != 'A') {
//				count[ran] = (ran - 'A');
//				
//			} else {
//				count[] = ran;
//
//			}
//			System.out.println(count[i]);
//
//		}
		// System.out.println(Arrays.toString(count));

		String str = "ABCDEFGHIJ";
		String[] strArr = new String[10];
		int ran = 0;
		for (int i = 0; i < 10; i++) {
			strArr[i] = str.charAt(i);

		}
		for (int i = 0; i < 100; i++) {
			ran = (int) (Math.random() * ('J' - 'A' + 1) + 'A');
			String sRan = Integer.toString(ran);
			fo
			System.out.println(sRan.equals(strArr[i]));

			// 저장할곳
			/*
			 * for(int j= 0; j<10; j++) { if(sRan.equals(strArr[j])) {
			 * 
			 * System.out.println("뽑힌 문자"+(char)ran+"들어있는문자"+strArr[i]);
			 * 
			 * }else { //System.out.println("다르다"); } } }
			 */

			System.out.println(Arrays.toString(strArr));
		}

	}
}
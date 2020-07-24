package day06;

/*
 * 
 *    *     1 
 *   *** 	3   2개
 *  *****	5 	2개
 * *******	7	2개
 */
public class Ex08 {
	public static void main(String[] args) {

		// 공백 5개 별 1개 공백 5개

		for (int i = 0; i < 5; i++) {
			// 공백 5개
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			// 별 1개인데 2배수로
			// i 횟수 받아서 k+2?
			for (int k = 0; k <= i; k++) { // 1 3//
				System.out.print("*");

				// 2를 더 해주는 for문
			}
			System.out.println();
		}
	}
}

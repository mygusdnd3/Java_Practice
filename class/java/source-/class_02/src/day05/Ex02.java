package day05;
/*
 * 예제 2]
 * 	다섯자리 숫자를 입력 받아서
 * 	그 숫자가 회문수 인지 아닌지 판별하세요
 * 	
 * 	단 for 반복문을 사용하세요
 *
 */

import javax.swing.*;

public class Ex02 {
	public static void main(String[] args) {

		String[] sArr = new String[5];
		// String tmp1 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
		// Sarr[0] = tmp1;
		int[] aNum = new int[5];
		String sum = "";
		sArr[0] = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
		sArr[1] = JOptionPane.showInputDialog("두번째 숫자를 입력하세요");
		sArr[2] = JOptionPane.showInputDialog("세번째 숫자를 입력하세요");
		sArr[3] = JOptionPane.showInputDialog("네번째 숫자를 입력하세요");
		sArr[4] = JOptionPane.showInputDialog("다섯번째 숫자를 입력하세요");

		System.out.println(sArr[0]);
		for (int i = 0; i < sArr.length; i++) {
			sum += sArr[i];
			System.out.println("sumtest: " + sum);
			

		}
		System.out.println(sum);
		char cSum1 = sum.charAt(0);
		char cSum2 = sum.charAt(1);
		char cSum3 = sum.charAt(2);
		char cSum4 = sum.charAt(3);
		char cSum5 = sum.charAt(4);
		cSum.
		
 
		// 회문수확인
		if () {
			if (sum.charAt(1) == sum.charAt(3)) {
				System.out.printf("입력하신 값 %d는 회문수 입니다.", sum);
			} else {
				System.out.printf("입력하신 값 %d는 회문수가 아닙니다", sum);
			}
		}
	}

}

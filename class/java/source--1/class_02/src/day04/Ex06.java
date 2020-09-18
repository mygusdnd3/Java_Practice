package day04;
/*
 *  문제 3]
 *  	정수 세개를 입력 받아서 
 *  	제일 큰 수부터 출력하세요.
 */

import javax.swing.*;

public class Ex06 {
	public static void main(String[] args) {
		String snum1 = JOptionPane.showInputDialog("출력하고자 하는 첫번째 정수를 입력하세요: ");
		String snum2 = JOptionPane.showInputDialog("출력하고자 하는 두번째 정수를 입력하세요: ");
		String snum3 = JOptionPane.showInputDialog("출력하고자 하는 세번째 정수를 입력하세요: ");

		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		int num3 = Integer.parseInt(snum3);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		int max, mid, min;

		if (num1 > num2) {        //명제를 하나 제시해놓고 시작한다
			// no1이 no2보다 큰경우
			if (num2 > num3) {
				// no2가 no3보다 큰경우
				max = num1;
				mid = num2;
				min = num3;

			} else {
				// no2보다 no3가 큰경우 1과 3의 비교가 필요

				if (num1 > num3) {
					max = num1;
					mid = num3;
					min = num2;
				} else {
					max = num3;
					mid = num1;
					min = num2;
				}
			}

		} else {
			// num2가 num1보다 큰경우
			if (num1 > num3) {
				max = num2;
				mid = num1;
				min = num3;
			} else {
				// num3이 num1보다 큰경우
				// num3과 num2를 비교
				if (num2 > num3) {
					max = num2;
					mid = num3;
					min = num1;
				} else {
					max = num3;
					mid = num2;
					min = num1;
				}
			}
		}

		/*
		 * if (num1 > num2) { if (num1 > num3) { if (num2 > num3) { a = num1; b = num2;
		 * c = num3;
		 * 
		 * } }else { a = num1; b = num3; c = num2; } } else if (num2 > num3) { // 1보다 큰데
		 * 3보다도 커?
		 * 
		 * if (num3 > num1) { a = num2; b = num3; c = num1; }else if(num1>num3) { a =
		 * num2; b = num1; c = num3; } } else if (num3>num2) {// 1이 2보다 크지만 3보단 작아 a =
		 * num3; b = num2; c = num1;
		 * 
		 * 
		 * }else { a = num3; b = num1; c = num2; }
		 * 
		 * /*
		 * 
		 * if (num1 > num2) { // num1이 크냐 if (num1 > num3) {
		 * 
		 * } else if(num2>num3) { // 2보단 큰데 3보단 작다 a = num3; b = num1; c = num2; //된다 }
		 * } else if (num2 > num3) { // num2가 크냐 1보다 큰데 3보다 크다 a = num2; b = num1; c =
		 * num3; //
		 * 
		 * } else { // num3이 크냐 1보단 큰데 3보단 안크다 (중간) a = num3; b = num2; c = num1;
		 * 
		 * }
		 */
		System.out.printf("큰수부터 나열 %d, %d, %d:", max, mid, min);
		

	}

}

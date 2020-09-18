package my_practice;
/*
 * 123 받아서 큰수부터 출력
 */

import javax.swing.*;

public class P_4 {
	public static void main(String[] args) {
		String snum1 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
		String snum2 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요");
		String snum3 = JOptionPane.showInputDialog("세번째 숫자를 입력하세요");

		int a = Integer.parseInt(snum1);
		int b = Integer.parseInt(snum2);
		int c = Integer.parseInt(snum3);

		int max, mid, min;

		if (a > b) {
			if (b > c) {
				max = a;
				mid = b;
				min = c;
			} else {
				if (a > c) {
					max = a;
					mid = c;
					min = b;
				} else {
					max = c;
					mid = a;
					min = b;
				}
			}
		} else if (a > c) {
			max = b;
			mid = a;
			min = c;
		} else {
			if (b > c) {
				max = b;
				mid = c;
				min = a;
			} else {
				max = c;
				mid = b;
				min = a;
			}
		}
		JOptionPane.showMessageDialog(null, "입력하신 숫자" +a+" "+b+" "
				+ ""+c+"의 나열은 :" + max +" "+ mid+" " + min);
	}
}

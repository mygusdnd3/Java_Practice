package my_practice;

import javax.script.*;
import javax.swing.JOptionPane;

public class Ex02_end {
	public static void main(String[] args) {

		/*
		 * String sno = JOptionPane.showInputDialog("숫자 다섯자리를 입력하세요");
		 * 
		 * String tmp = "";
		 * 
		 * int len = sno.length(); //5개 '갯수'를 int값으로 전달 for(int i =0; i<len;i++) { //len
		 * - 5개 tmp +=sno.charAt((4)-i); System.out.println(tmp); }
		 * 
		 * boolean bool = sno.equals(tmp);
		 * 
		 * if(bool == true) { System.out.println(sno+"회문수입니다"); }else {
		 * System.out.println(sno+"회문수가 아닙니다."); }
		 */

		String sno = JOptionPane.showInputDialog("숫자입력");

		String tmp = "";

		for (int i = 0; i < sno.length(); i++) {
			tmp += sno.charAt((sno.length() - 1) + 1);
		}

	}
}
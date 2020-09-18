package day04;
/*
 * 예제 4]
 * 		년도를 입력하고 
 * 		그해가 윤년인지 아닌지 판별해서 출력하세요.
 * 
 * 		해결은 다중 조건문으로다가.
 */

import javax.swing.*;

public class Test08 {
	public static void main(String[] args)  {
		String snum = JOptionPane.showInputDialog("년도를 입력하세요");
		int year = Integer.parseInt(snum);

		// 조건이 큰거부터 분류해서 내려가라
		if (year % 400 == 0) {
			// 4나눠서 떨어지는게 0이냐
			if (year % 100 != 0) {
				// 100으로 나누어 떨어지지 않는가?

			} else if (year % 4 == 0) {
				System.out.printf("[입력하신 %4d는 윤년입니다.]", year);
				JOptionPane.showMessageDialog(null, "[입력하신" + year + " 는 윤년입니다.]");
				
			}

		} else {
			JOptionPane.showMessageDialog(null, "[입력하신" + year + " 는 윤년이 아닙니다.]");
			
			/*
			 * String str = "평년"; if (year % 400==0) { str = "윤년"; } else if( year % 100 ==
			 * 0) { str = "평년"; } else if( year % 4 == 0) { str = "윤년"; } else { str = "평년";
			 * } JOptionPane.showMessageDialog(null, "입력한 해" + year + "은 "+str+"입니다");
			 */
		}
	}
}

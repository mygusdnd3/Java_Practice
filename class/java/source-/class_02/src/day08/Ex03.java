package day08;

/*
 *  계산식을 입력하면
 *  계산의 결과를 출력해주는 프로그램을 작성하세요.
 *  단, 배열을 이용해서 처리하세요
 *  예	]
 *  
 *  	계산식을 입력하세요 : 22-11
 *  	22-11 의 결과는 11 입니다.
 *  	
 *  
 *  	힌트 ]
 *  
 *  		"421-111"
 *  		로 입력하는 경우
 *  		"421","-","111" 	
 *  	
 *  bonus ] 
 *  	계산기를 만들어주세요.
 */
import javax.swing.*;

public class Ex03 {

	public static void main(String[] args) {

		boolean bool = true;
		while (bool) {
			String str = JOptionPane.showInputDialog("계산하고자 하는 식을 입력하세요");
			// 배열로?배열로

			if (str.equals("q")) {
				break;
			}
			String[] sArr = new String[3];
			int idx = 0;// 연산 기호의 위치를 저장할 변수
			for (int i = 0; i < str.length(); i++)
				if (str.charAt(i) < '0' || str.charAt(i) > '9') {
					idx = i;
				}
			sArr[0] = str.substring(0, idx);
			sArr[1] = str.substring(idx, idx + 1);
			sArr[2] = str.substring(idx + 1);

			// 숫자 형태의 문자열을 정수로 변환 시키고
			int num1 = Integer.parseInt(sArr[0]);
			int num2 = Integer.parseInt(sArr[2]);

			int result = 0;
			/*
			 * switch (sArr[1]) { case "+": result = num1 + num2;
			 * 
			 * break; case "-": result = num1 - num2;
			 * 
			 * break; case "*": result = num1 * num2;
			 * 
			 * break; case "/": result = num1 / num2; break; case "%": result = num1 % num2;
			 * break; // default:
			 * 
			 * }
			 */
			char ch = sArr[1].charAt(0);
			if (ch == '+') {
				result = num1 + num2;
			} else if (ch == '-') {
				result = num1 - num2;
			} else if (ch == '*') {
				result = num1 * num2;
			} else if (ch == '/') {
				result = num1 / num2;
			} else if (ch == '%') {
				result = num1 % num2;
			}
			// 결과 출력하고
			JOptionPane.showMessageDialog(null,
					"주어진 식 : [" + str + "] 의 결과는 \n " + num1 + " " + sArr[1] + " " + num2 + " =" + result);

		}
		/*
		 * int a = 0; int b = 0; String tmp_1 = ""; String tmp_2 = ""; int[] aa = new
		 * int[10]; for (int i = 0; i < str.indexOf("-"); i++) { str.substring(0,
		 * str.indexOf("-")); }
		 * 
		 * if (str.contains("-")) { tmp_1 = str.substring(0, str.indexOf("-")); tmp_2 =
		 * str.substring(str.indexOf("-")); a = Integer.parseInt(tmp_1); b =
		 * Integer.parseInt(tmp_2); int result = a - b; System.out.println(result); }
		 * else if (str.contains("+")) { tmp_1 = str.substring(0, str.indexOf("+"));
		 * tmp_2 = str.substring(str.indexOf("+")); a = Integer.parseInt(tmp_1); b =
		 * Integer.parseInt(tmp_2); int result = a + b; System.out.println(result); }
		 * 
		 * for (int i = 0; i < str.indexOf("-"); i++) {
		 * 
		 * }
		 * 
		 * System.out.println(a);
		 */
	}

}

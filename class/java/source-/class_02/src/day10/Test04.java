package day10;

/*
 		정수 두 수를 입력 받고 계산 방식을 입력 받아서
 		산술 연산의 결과를 보여주는 프로그램을 작성하세요.
 		각 연산별로 함수를 만들어서 처리한다.
 */

import javax.swing.*;

public class Test04 {

	int num1 = 0;
	int num2 = 0;
	String mark = " ";
	public Test04() {
		int res = calc();
		JOptionPane.showMessageDialog(null,"입력된 숫자" +num1+"과"+num2+" 의 "+ mark +" 연산 결과는"+res+"입니다");
	}

	// 전체 계산하는 함수
	public int calc() {
		// 반환 데이터 기억할 변수 만들고.
		int result = 0;
		
		// 숫자 두개 입력받아서 기억하고
		int no1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요:"));
		num1 = no1;
		int no2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요:"));
		no2 = no2;
		boolean bool = true;
		while (true) {
			String giho = JOptionPane.showInputDialog("연산 기호를 입력하세요!");
			
			switch (giho) {
			case "+":
				result = plus(no1, no2);
				break;
			case "-":
				result = minus(no1, no2);
				break;
			case "*":
				result = gop(no1, no2);
				break;
			case "/":
				result = nanum(no1, no2);
				break;
			case "%":
				result = namugi(no1, no2);
				break;

			default:
				JOptionPane.showMessageDialog(null, "입력이 잘못되었습니다.");
				continue;			
			}
			mark = giho;
			break;
			
		}
		return result;

	}

	// 더하기 연산 전담 처리 함수
	public int plus(int no1, int no2) {
		/*
		 * int result = no1 + no2; return result;
		 */
		return no1 + no2;
	}

	// 빼기 연산 전담 처리 함수
	public int minus(int no1, int no2) {

		return no1 - no2;

	}

	// 곱하기 연산 전담 처리 함수
	public int gop(int no1, int no2) {
		return no1 + no2;

	}

	// 나누기 연산 전담 처리 함수
	public int nanum(int no1, int no2) {

		return no1 / no2;
	}

	// 나머지 연산 전담 처리 함수
	public int namugi(int no1, int no2) {

		return no1 % no2;
	}
	
	

	public static void main(String[] args) {
		new Test04();
		

	}

}

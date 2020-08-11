package day18;

import javax.swing.*;

public class Test01 {

	public Test01() {
		boolean bool = true;
		while (bool) {
		String sno = JOptionPane.showInputDialog("1 ~ 10 사이의 정수를 입력하세요");
		int no = 0;
			try { // 숫자 형태가 아닌 입력될 경우는 숫자 포멧 예외가 발생할것이므로
					// 예외 처리를 해줘야 한다.
				no = Integer.parseInt(sno);
				if (no > 10 || no < 1) {
					// 이 부분에서 강제로 우리가 정한 예외 클래스의 예외를 발생시켜야 한다.
					// 따라서 우리가 만든 예외 클래스를 강제로 던져야 한다.
					throw new Except01();
				} 
				else {
					bool = false;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
				continue;
			} catch (Except01 e) {		//toString을 이용하여 문자열을 리턴받는다.
				JOptionPane.showMessageDialog(null, e.toString());
			//	System.out.println(e);
				continue;
			} catch (Exception e) {
				continue;

			}
			JOptionPane.showMessageDialog(null, "입력한 숫자 :"+no);
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}

// 1~10 사이 예외의 숫자가 입력하면 발생될 예외 클래스
// 즉, 우리가 제작하는 클래스에서만 통용될 예외를 만든다.
// 1. Exception 클래스를 상속 받은 클래스를 만든다.
class Except01 extends Exception {

	// 2. 예외의 정보를 출력할 toString() 함수를 오버라이드 한다.
	public String toString() {
		return "1 ~ 10 사이의 숫자가 아닙니다.";	//
	}

}
class Except02 extends Exception{
	
	public String toString() {
		return "문자를 입력하셨습니다";
	}
}
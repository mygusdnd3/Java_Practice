package day16;

import javax.swing.JOptionPane;

public class Test07 {

	public Test07() {
		String sno = JOptionPane.showInputDialog("정수를 입력하세요");
		int no;
		int errorCode = 0;
		try {
			no = Integer.parseInt(sno);

		} catch (ArrayIndexOutOfBoundsException e) {
			errorCode = -8897;
			System.out.println("에러가 발생했습니다 에러코드 : " + errorCode);
			// System.out.println(e);
			// e.printStackTrace();
		} catch (NullPointerException e) {
			errorCode = -8898;
			System.out.println("에러가 발생했습니다 에러코드 : " + errorCode);
			System.out.println(e);
			e.printStackTrace();
		} catch(NumberFormatException e) {
			errorCode = -8896;
			System.out.println("관리자에게 문의하십시요 에러코드 :" + errorCode);
		}
			catch (Exception e) {
			errorCode = -0000;
			System.out.println("관리자에게 문의하십시요 에러코드 :" + errorCode);
		}
//			for(int a : iArr) {
//				System.out.println(a);
//			}
		if (errorCode != 0) {
			System.out.println("에러 코드를 확인해주세요, 프로그램을 종료합니다");
			System.exit(0);
		} else {
			System.out.println("코드진행성공.");

		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
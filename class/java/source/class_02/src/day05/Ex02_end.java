package day05;

import javax.swing.JOptionPane;

public class Ex02_end {

	public static void main(String[] args) {

		String sno = JOptionPane.showInputDialog("다섯자리 숫자입력");
		
		//문자열의 길이를 반환해 주는 함수 : length();
		String tmp="";
		int len = sno.length();
		/*for(int i = 0; i< sno.length(); i++) {
			tmp += sno.charAt((sno.length() -1)-1);
		}
		*/
		
		for (int i = 0; i<len;i++) {
			tmp += sno.charAt((len -1)-i);
		}
		
		//만들어진 문자열을 비교한다.
		boolean bool = sno.equals(tmp);
		
		if(bool == true	) {
			System.out.println("입력한 숫자 "+sno+"는 회문수 입니다.");
			
		}else {
			System.out.println("입력한 숫자 "+sno+"는 회문수가 아닙니다.");
		}

	}

}

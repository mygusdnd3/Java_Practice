package day05;

// 지역번호를 입력하면 지역을 출력해주는 프로그램을 만들어 보자.

import javax.swing.*;
public class Test01 {
	public static void main(String[] args) {
		// 먼저 지역 번호를 입력 받는다.
		String scode = JOptionPane.showInputDialog(" 지역 번호를 입력 하세요");
	
		String slocal ="";
		switch(scode) {
		case "02":
			slocal ="서울";
			break;
		case "031":
			slocal ="경기";
		//	break;
		case "032":
			slocal ="인천";
		//	break;
			
		case "041": //충남
			slocal ="충남";
		//	break;
			
		case "051": //부산
			slocal ="부산";
		//	break;
			
		default:
			slocal ="핸드폰";
					
		}
		/*
		 *		구 버전의 자바에서는 switch ~case 구문에서 문자열 데이터 비교를 지원하지 않았다.
		 *		1.6(?) 버전부터 문자열 데이터 비교도 가능하게 됬다. 
		 */
		JOptionPane.showMessageDialog(null, "입력한 지역번호 ["+scode+"]는 "+slocal+" 번호입니다.");
		
	}
}

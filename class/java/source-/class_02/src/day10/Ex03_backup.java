package day10;

import java.util.Arrays;

/*
 	문제 3]
 	
 		5명의 학생의
 		java, oracle, html, jsp
 		점수를 입력 받아서
 		총점과 석차를 구하는 프로그램을 작성하세요
 		
 		단, 입력, 총점계산, 석차계산, 출력은 함수를 작성해서
 		처리하세요.
  
  
  		10/50/80/90/
  		//	indexOf(int ch, int fromIndex)
//		ch 		: 찾을 문자
//  fromIndex : 찾을 시작위치
//	단, 입력, 총점계산, 석차계산, 출력은 함수를 작성해서
//		처리하세요.
 * 	  lastIndexOf(int ch)
	  	뒤에서 부터 찾을 문자를 검색해서 해당 위치를 반환해준다.
 * 
	// 입력
 */


import javax.swing.*;

public class Ex03_backup {
	
	
	public Ex03_backup() {
		setPoint();
	}

	int[][] st = new int[5][4];
	int idx;
	public void setPoint() {

		for (int i = 0; i < st.length; i++) {
			String str = JOptionPane.showInputDialog("점수를입력");
			String tmp;
			int idx;
			for (int j = 0; j < st[i].length; i++) {

				idx = str.indexOf('/');
				System.out.println(idx);
				String s = str.substring(0, idx);
				idx = str.indexOf('/', idx+1);
				System.out.println(idx);
			
				
			}

		}


	}




	public static void main(String[] args) {

		Ex03_backup e = new Ex03_backup();
		e.setPoint();
//			String str = "10/20/30/40";
//			//
//			String data[] = str.split("/");
//			
//			for(int i = 0; i<data.length;i++) {
//				System.out.println(data[i]);
//			}
	}

}

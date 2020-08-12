package day20;
/*
 	choiceformat을 만들때
 	limits와 format을 하나라 만들 수 있다
 	
 	만드는 형식 
 		60#D  		60 <= 의미 60보다 크거나 같으면 D
 		70<C		70<의 의미
 		이것을 | 를 이용해서 연결하면 된다.

	학생의 점수를 입력받아
	학점을 출력하는 프로그램을 만들어 보자
	
 */

import java.text.*;
import javax.swing.*;
public class Test06 {

	public Test06() {
		//패턴 만들고
		String pattern = "0#F|60#D|70<C|80#b|90#A";
		ChoiceFormat form = new ChoiceFormat(pattern);
		while(true) {
		//점수 입력 받고
		String sno = JOptionPane.showInputDialog("점수를 입력하세요\n 종료는 q를 입력하세요");
		if(sno.equals("q"))break;
		int score = 0;
		try {
			score = Integer.parseInt(sno);
		} catch(Exception e) {e.printStackTrace();}
		//학점 구하고
		String grade = form.format(score);
		//출력
		JOptionPane.showMessageDialog(null, "획득한 점수 : " + score+"| 산출된 학점 : "+grade);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}

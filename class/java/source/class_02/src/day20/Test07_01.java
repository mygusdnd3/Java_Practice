package day20;

import java.text.*;

import javax.swing.JOptionPane;
public class Test07_01 {

	public Test07_01() {
	MessageFormat form = new MessageFormat("이름 : {0}, 성별 : {1}, 나이 : {2}, 연락처 : {3}, 이메일 : {4} ");
	
	String[][] data= {
			{"김개똥","M","19","010-2033-4944","memm@gmail.com"},
			{"김소똥","W","29","010-2533-4944","234m@gmail.com"},
			{"김말똥","M","39","010-2233-4944","me12d@gmail.com"},
			{"김닭똥","W","49","010-1033-4944","mem234@gmail.com"},
	};
	
	String str="";
	for (int i = 0; i < data.length; i++) {
		str = form.format(data[i]);
		System.out.println(str);
	}
	ChoiceFormat form2 = new ChoiceFormat("0#F|60#D|70#C|80#D|90<A");
	
	String sno = JOptionPane.showInputDialog("점수를 입력하세요");
	int no = 0;
	try {
		no = Integer.parseInt(sno);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	String grade = form2.format(no);
	System.out.println(grade);
	
	
	}

	public static void main(String[] args) {
		new Test07_01();
	}

}

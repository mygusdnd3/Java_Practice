package day20;

import java.text.MessageFormat;

import javax.swing.JOptionPane;

/*
  MessageFormat 을 사용해서 형식에 맞는 문자열을 만들어 보자.
  
  "Name : 전은석, tel : 010-3175-9042, Mail : enus@increpas.com"
  "Name : 전은석, tel : 010-3175-9042, Mail : enus@increpas.com"
 */
public class Test07 {

	public Test07() {
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Mail : {2}");
		/* 
		 	동일한 내용은 그대로 쓰고
		 	변화되는 부분만 {0},{1},{2} 로 기록한다.
		 	이때 번호는 입력되는 데이터의 순서를 의미한ㄷ.
		 */
		String[][] data = {
				{ "전은석1", "010-3175-9042", "enus@increpas.com"},
				{ "전은석2", "010-3175-9042", "enus@increpas.com"},
				{ "전은석3", "010-3175-9042", "enus@increpas.com"},
				{ "전은석4", "010-3175-9042", "enus@increpas.com"},
				 
		};
		
		//String[] data ={ "Name : 전은석, tel : 010-3175-9042, Mail : enus@increpas.com"};
//		String result =form.format(data);
		String result ="";
		for (int i = 0; i < data.length; i++) {
			result = form.format(data[i]);
			if(i < data.length -1) result +="\n";
			JOptionPane.showMessageDialog(null, result);
		}
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}

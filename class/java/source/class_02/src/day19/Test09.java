package day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
 	문제 5]
 		이메일을 입력받아
 		형식에 맞는지 아닌지 판별해서 출력하세요
 */
public class Test09 {

	public Test09() {
		boolean bool = true;
		while(bool) {
		String email = JOptionPane.showInputDialog("이메일주소를 입력하세요");
						
		Pattern p = Pattern.compile("[a-zA-Z]{1}[a-zA-Z-0-9_]*[@][a-zA-Z0-9]*[.](com|net|tv|kr)");
		
		Matcher m = p.matcher(email);
		if(m.matches()) {
			bool = false;
			System.out.println("Ok");
		}else {
			System.out.println("잘못썼어");
			
		}
		}
			
		
	}

	public static void main(String[] args) {
		new Test09();
	}

}

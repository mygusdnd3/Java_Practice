package day19;

/*
 	문제 4 ]
 	자바 소스파일 이름을 입력 받아서
 	해당 파일이 정상적인 소스파일인지 아닌지 판별하세요
 	
 	ex]
 		abc.txt = 자바 소스 파일이 아닙니다.
 		자바클래스 이름만드는 규칙
 		암묵적으로 첫글자는 대문자로 써야한다. 간혹 특수문자가 올수도 있다,(_$)
 		숫자로 시작해서는 안된다.
 		파일이름은 클래스 이름과 같이, .java가 붙어야한다.
 		
 		1. 패턴을 만든다
 		2. 검사해서 Matcher 객체로 얻어내고
 		3. 그 객체를 통해서 뽑아낸다.
 */
import java.util.regex.*;
import javax.swing.*; 

public class Test08 {

	public Test08() {
		boolean bool = true;
		while (bool) {
			String java = JOptionPane.showInputDialog("파일 이름을 입력하세요");
			String name = JOptionPane.showInputDialog("이름을 입력하세요");
			
			//Pattern pjava = Pattern.compile("[A-Z_$][a-zA-Z0-9_$]*[.]java"); //"[A-Z_$][a-zA-Z0-9_$]*[.]java")
			Pattern pjava = Pattern.compile("[A-Z_$][a-zA-Z0-9_$]*[.]java$"); //"[A-Z_$][a-zA-Z0-9_$]*[.]java")
			Pattern pname = Pattern.compile("[^a-zA-Z0-9!@#$%&]{2,3}");

			Matcher pm = pname.matcher(name);
			if(pm.matches()) {
				JOptionPane.showMessageDialog(null, "정상입력되었습니다");
			}else {
				
				JOptionPane.showMessageDialog(null, "다시 입력해주세요");
			}
			
			Matcher m = pjava.matcher(java);
			String mResult ="";
			if (m.matches()) {
				bool = false; 
				mResult = "맞습";
			} else {
				mResult = "아닙";
			} 
			JOptionPane.showMessageDialog(null, "입력하신 "+java+ "는 자바 파일이 "+ mResult + "니다");
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}

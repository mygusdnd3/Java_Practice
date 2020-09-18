package tmp;

import java.util.Arrays;

public class Day12Ex04 {

	
	// String 클래스의 생성자 함수중
	///String(Char[] ch)
	//를 이용하면 문자배열을 문자열로 만들어 준다.
	public Day12Ex04() {
		String str = getString();
		
		//출력
		
		System.out.println("랜덤하게 만들어진 문자열 : "+str);
	}
	public String getString() {
		char[] ch = new char[10];
		for(int i = 0 ; i< ch.length; i++) {
			char tmp = (char)(Math.random()*26+'A');
			ch[i] = tmp;
		}
		System.out.println(Arrays.toString(ch));
		return new String(ch);
	}
	public static void main(String[] args) {
		new Day12Ex04();
	}

}

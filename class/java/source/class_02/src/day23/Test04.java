package day23;

/*
 	ArrayList에 문자열 데이터만 입력하도록
 	제너릭스를 선언해서 처리해보자.
 */
import java.io.*;
import java.util.*;
public class Test04 {

	public Test04() {
		ArrayList<String> sList = new ArrayList<String>();
		//이제 이 리스트는 문자열이 아닌 다른 데이터가 입력되면 에러가 발생한다.
		//문자열만 입력 받도록 선언을 해 놓았으므로..
		
		/*
		sList.add('a');
		sList.add(true);
		*/
		sList.add("문자열");
		sList.add("전화번호");
		sList.add("010-1234-1234");
		
		for(int i = 0; i < sList.size();i++) {
			String name = sList.get(i); // List에는 문자열 데이터만 입력받도록 선언됨
			System.out.println((i+1)+"번 :" +name);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}

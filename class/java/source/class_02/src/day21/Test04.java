package day21;

/*
 	랜덤하게  1~10까지 숫자를 만들어서
 	10개를 ArrayList에 담고
 	출력하고
 	정렬하고
 	출력해보자
 */
import java.util.*;
public class Test04 {

	public Test04() {
		viewList() ;
	}
	
	// ArrayList 만들고 출력해주는 함수
	
	public void viewList() {
		// 1. ArrayList를 준비한다.
		ArrayList list = new ArrayList();
		
		// 2.랜덤하게 숫자를 만들고 담는다. 10번
		for(int i = 0 ; i < 10; i++) {
			//숫자만들고
			int no = (int)(Math.random()*10 + 1);
			//리스트에 담고
			list.add(no);
		}
		// 3. 출력하고
		for(Object o : list) {
			System.out.print((int)o+"|");
		}
		System.out.println();
		// 4. 정렬하고
		Collections.sort(list);
		// 5. 출력하고
		for(Object o : list) {
			System.out.print((int)o+"|");
		}
		System.out.println();
		// 내림차순 정렬
		Collections.reverse(list);	//리버스는 순서만 뒤집는다.(정렬안함) 고로 sort부터 해줘야함
		for(Object o : list) {
			System.out.print((int)o+"|");
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}

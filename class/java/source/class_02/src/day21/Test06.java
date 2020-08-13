package day21;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

/*
 	랜덤하게 10~50 사이의 반지름을 가지는 원을
 	ArrayList에 10개를 채우고
 	출력하고
 	정렬하고
 	출력하세요
 */
public class Test06 {
	ArrayList tmp = new ArrayList();
 
	public Test06() {
		for (int i = 0; i < 10; i++) {
			setArrList();
		}
		System.out.println("****정렬전");
		toPrint();
		
		compare();
		System.out.println("****정렬됨");
		toPrint();
		System.out.println("****뒤집음");
		reSort();
		toPrint();
		
		
	}
	//출력함수
	public void toPrint() {
		for (int i = 0; i < 10; i++) {
			System.out.println(tmp.get(i));
		}
	}
	public void compare() {
		Collections.sort(tmp);
	}
	 
	public void reSort() {
		Collections.reverse(tmp);
	}

	ArrayList setArrList() {
		Won n = new Won(); // 원 초기화
		// 랜덤하게 10~50을 생성해서 반지름에 넣자
		int num = (int) (Math.random() * 50 - 10 + 1) + 10;

		n.setRad(num);
		n.setArround();
		n.setArea();
		tmp.add(n);

		return tmp;
	}

	public static void main(String[] args) {
		new Test06();
	}

}

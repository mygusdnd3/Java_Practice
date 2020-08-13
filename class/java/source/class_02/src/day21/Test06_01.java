package day21;

import java.util.*;
public class Test06_01 {

	public Test06_01() {
		ArrayList list = new ArrayList();
		
		for(int i = 0 ; i < 10; i++) {
			Won w = getWon();
			list.add(w);
		}
		System.out.println("정렬전");
		for(Object o : list) {
			System.out.println(o);
		}
		
		Collections.sort(list);
		System.out.println("정렬전");
		for(Object o : list) {
			System.out.println(o);
		}
		
		Collections.reverse(list);
		System.out.println("내침차순정렬");
		for(Object o : list) {
			System.out.println(o);
		}
		
	}

	public Won getWon() {
		Won won = new Won();
		
		int rad = (int)(Math.random()*41+10);
		won.setRad(rad);
		won.setArround();
		won.setArea();
		
		return won;
	}
	public static void main(String[] args) {
		new Test06_01();
	}

}

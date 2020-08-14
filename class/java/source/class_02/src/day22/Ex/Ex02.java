package day22.Ex;

import java.util.*;

/*
 	문제 2 ]
 		랜덤한 숫자를 10개를 발생 시켜서 (11-99) TreeSet에 저장하고 출력하고
 		정렬 방식을 내림차순으로 변경해서 저장하고 출력하고
 */
public class Ex02 {

	public Ex02() {
		TreeSet set = new TreeSet();
		set.add((int)(Math.random()*99-11+1)+11);
		set.add((int)(Math.random()*99-11+1)+11);
		set.add((int)(Math.random()*99-11+1)+11);
		set.add((int)(Math.random()*99-11+1)+11);
		set.add((int)(Math.random()*99-11+1)+11);
		set.add((int)(Math.random()*99-11+1)+11);
		set.add((int)(Math.random()*99-11+1)+11);
		set.add((int)(Math.random()*99-11+1)+11);
		set.add((int)(Math.random()*99-11+1)+11);
		set.add((int)(Math.random()*99-11+1)+11);
		
		for(Object o : set) {
			System.out.print(o+" | ");
		}
		System.out.println();
		
		ArrayList list = new ArrayList(set);
		Collections.reverse(list);
		
		
		for(Object o : list) {
			System.out.print(o+" | ");
		}
		
//		TreeSet set2 = new TreeSet(new Comparator() {
//			
//			@Override
//			public int compare(Object o1, Object o2) {
//				TreeSet a
//				return 0;
//			}
//			
//		});
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}

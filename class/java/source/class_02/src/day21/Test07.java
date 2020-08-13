package day21;

import java.util.*;

/*
 	랜덤하게 10~50 사이의 반지름을 가지는 Circle을
 	ArrayList에 10개를 채우고
 	출력하고
 	정렬하고
 	출력하세요
 */
public class Test07 {

	class MySort2 implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Circle c1 = (Circle)o1;
			Circle c2 = (Circle)o2;
			double result = c1.getArea() - c2.getArea();
			return -result>0? 1:-1;	//데이타를 통째로 뒤집는다
		}
		
	}
	public Test07() {
		//ArrayList를 준비한다.
		ArrayList list = new ArrayList();
		// list에 Circle을 10개 채운다.
		for (int i = 0; i < 10; i++) {
			Circle won = getCircle();
			list.add(won);
			
		}
		//출력한다.
		System.out.println("1. 정렬 전");
		for(Object o : list) {
			System.out.println(o);
		}
		// 정렬한다.
		//지금처럼 정렬기준이 없거나 정렬 기준을 바꿔야 할 경우는 Comparator를 만들어서 Collections.sort(list, Comparator c);
		//로 정렬을 한다. 
/*
		//** 외부클래스 이용방법
		Collections.sort(list,new MySort1());
		//출력한다.
		System.out.println("2. 정렬 후");
		for(Object o : list) {
			System.out.println(o);
			
		}
		//내림차순 출력
		Collections.reverse(list);
		//출력한다.
		System.out.println("3. 내림차순정렬 후");
		for(Object o : list) {
			System.out.println(o);
			
		}
*/		
		//전역 내부클래스 이용방법
		Collections.sort(list,new MySort2());
		//출력한다.
				System.out.println("2. 뒤집고");
				for(Object o : list) {
					System.out.println(o);
					
				}
				//내림차순 출력
				Collections.reverse(list);
				//출력한다.
				System.out.println("3. 그걸 다시뒤집고");
				for(Object o : list) {
					System.out.println(o);
				}
				Collections.sort(list,new Comparator() {

					@Override 
					public int compare(Object o1, Object o2) {
						Circle c1 = (Circle)o1;
						Circle c2 = (Circle)o2;
						double result = c1.getArea() - c2.getArea();
						return -result>0? 1:-1;	//데이타를 통째로 뒤집는다
					} 
					
				});
	}	
	public Circle getCircle() {
		Circle won = new Circle();
		
		int rad = (int)(Math.random()*41+10);
		won.setRad(rad);
		won.setArround();
		won.setArea();
		
		return won;
	}

	public static void main(String[] args) {
		new Test07();
	}

}

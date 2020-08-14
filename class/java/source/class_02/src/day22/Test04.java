package day22;

import java.util.*;
import day22.source.*;
public class Test04 {

	public Test04() {
		
		TreeSet set = new TreeSet();
		//TreeSet set = new TreeSet(new Comparator() {
			
//			public int compare(Object o1, Object o2) {
//				//할일
//				// o1, o1 를 Circle 타입으로 강제 형변환
//				Circle c1 = (Circle)o1;
//				Circle c2 = (Circle)o2;
//				//풀어서
//				/*double result = c1.getArea() - c2.getArea();
//				result > 0 ? 1: (result == 0)?0:-1;*/
//				return c1.getArea() - c2.getArea()>0?1:(c1.getArea() - c2.getArea()==0)?0:-1;
//				
//			}
//			
//		});
		
		set.add(new Circle((int)(Math.random()*20-5+1)+5));
		set.add(new Circle((int)(Math.random()*20-5+1)+5));
		set.add(new Circle((int)(Math.random()*20-5+1)+5));
		set.add(new Circle((int)(Math.random()*20-5+1)+5));
		set.add(new Circle((int)(Math.random()*20-5+1)+5));
	
		System.out.println(set);
		for(Object o : set) {
		System.out.println(o);
	}
}
	

	public static void main(String[] args) {
		new Test04();
	}

}

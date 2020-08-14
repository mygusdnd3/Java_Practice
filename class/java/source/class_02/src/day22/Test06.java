package day22;

import java.util.*;
public class Test06 {

	public Test06() {
		TreeSet set =new TreeSet();
//		set.add(1);
//		set.add(31);
//		set.add(14);
//		set.add(35);
//		set.add(86);
//		set.add(21);
//		set.add(14);
//		set.add(3);
//		set.add(1);
		set.add("문자열");
		set.add("고길동");
		set.add("고길둥");
		set.add("둘셋");
		set.add("둘넷");
		set.add("둘다섯");
		set.add("둘여섯");
		set.add("둘일곱");
		set.add("둘여덜곱");
		set.add("둘아홉곱");
		set.add("둘열곱");
		set.add("고길둥");
		
		System.out.println("set.size() : "+ set.size());
		for(Object o : set) {
			System.out.print(o+" | ");
		}
		System.out.println("-------------------------------");
	
		SortedSet set1 = set.headSet("둘넷");
		System.out.println("set1.size() : "+ set1.size());
		for(Object o : set1) {
			System.out.println(set1+" | ");
		}
		SortedSet set2 = set.subSet("둘넷", "둘열곱");
		System.out.println("set2.size() : "+ set2.size());
		for(Object o : set2) {
			System.out.print(set2+" | ");
		}
		
		SortedSet set3 = set.tailSet("둘열곱");
		System.out.println("set3.size() : "+ set3.size());
		for(Object o : set3) {
			System.out.print(set3+" | ");
		}
				
	}

	public static void main(String[] args) {
		new Test06();
	}

}

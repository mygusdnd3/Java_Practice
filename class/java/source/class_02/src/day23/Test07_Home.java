package day23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
import day23.source.Student;
public class Test07_Home {

	public Test07_Home() {
		ArrayList<Integer> noList = new ArrayList<Integer>();
		for(int i = 0 ; i< 5; i++) {
			noList.add(1001+i);
		}
		ArrayList<String> names = new ArrayList<String>();
		names.add("우지윤");
		names.add("안지영");
		names.add("청하");
		names.add("진로");
		names.add("참이슬");
		
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for(int i = 0; i < names.size(); i++) {
			int[] score = new int[4];
			for(int j = 0; j<4; j++) {
				score[j] = (int)(Math.random()*41+60); 
			}
			Student s = new Student(noList.get(i),names.get(i),score);
			map.put(noList.get(i), s);
		}
	Set<Integer> keys = map.keySet();
	
	ArrayList<Integer> kList = new ArrayList<Integer>(keys);
	
	Collections.sort(kList);
	
	for(int i = 0 ; i < kList.size(); i++) {
		int no = kList.get(i);
		Student s = map.get(no);
		System.out.println(no +"번 학생 - 이름 : "+s.getName()+", 총점 :" +s.getTotal());
	}
	
	HashSet<String> hSet = new HashSet<String>();
	hSet.add("김정민");
	hSet.add("바보");
	hSet.add("똥개");
//	for (int i = 0; i < 50; i++) {
//		hSet.add(('A'+i)+"");
//	}
	hSet.remove("똥개");
	Iterator<String> itor = hSet.iterator();
	while(itor.hasNext()) {
		System.out.print(itor.next());
	}
	
	}

	public static void main(String[] args) {
		new Test07_Home(); 
	}

}

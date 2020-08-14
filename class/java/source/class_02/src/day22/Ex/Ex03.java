package day22.Ex;

/*
 	문제 3 ]
 		학생 성적을 관리하기 위한 클래스를 제작하세요
 			String name
 			int ban
 			int score        전역
 			
 		이 클래스를 TreeSet에 저장할 때 이름순으로 정렬되서 저장되게 하고 데이터를 5개를 만들어서 저장하고
 		출력하세요
 		반 순으로 정렬되서 저장되게 하고 출력하고
 		점수 순으로 저장되게 하고 출력하고
 		만약 반이 같으면 점수순으로 출력
 */
import java.util.*;

import day22.source.StdClass;
public class Ex03 {

	public Ex03() {
		TreeSet std = new TreeSet();

		
		std.add(getClass("보라돌이"));
		std.add(getClass("뚜비"));
		std.add(getClass("나나"));
		std.add(getClass("뽀"));
		std.add(getClass("햇님"));
		

		for(Object o : std) {
			System.out.println((StdClass)o);
		}
		
	}
	
	public StdClass getClass(String name) {
		StdClass sc = new StdClass(name);
		int ban = (int)(Math.random()*11);
		int score = (int)(Math.random()*100-50+1)+50;
		sc.setData(ban, score);
		
		return sc;
	}

	public static void main(String[] args) {
		new Ex03();
	}

}

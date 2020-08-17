package day23;

import java.util.*;
public class Test05 {

	public Test05() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("보라돌이");
		names.add("뚜비");
		names.add("나나");
		names.add("뽀");
		names.add("햇님");
		names.add("마이크0");
		names.add("마이크1");
		names.add("마이크2");
		names.add("마이크3");
		
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		
		loop:
		for(int i = 0; i < 3;i++) {
			ArrayList<String> n  = new ArrayList<String>();
			for(int j = 0; j<3;j++) {
				int no = 3*i+j;
				
				n.add(names.get(no));
			}
			list.add(n);
		}//for문 끝
		//System.out.println("list.size() :" +list.size());
		for(int i = 0 ; i < list.size();i++) {
			System.out.println("####"+(i+1)+"팀 ###");
			ArrayList<String> l = list.get(i);
			for(int j = 0; j < l.size();j++) {
				String str = l.get(j);
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}

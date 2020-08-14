package day22;

import java.util.*;
public class Test07 {

	public Test07() {
		Hashtable table = new Hashtable();
		table.put("이름", "지원자");
		table.put("성별","남자");
		table.put("전화", "010-1111-1111");
		/*
		 	위 처럼 Map 계열은 데이터를 입력할 때
		 	그 데이터를 구분하는 키값과 한쌍으로 만들어서 입력해야 한다.
		 	
		 */
		
		// 데이터 꺼내서 출력하기
		System.out.println("이름 : "+table.get("이름"));
		// 데이터를 꺼낼때는 반드시 키값을 알아야 꺼낼 수 있다.
		
		// 같은 키값의 데이터를 입력
		
		System.out.println("전화 :" +table.get("전화"));
		table.put("전화", "010-5855-9999");
		System.out.println("전화 :" +table.get("전화"));
		
		//같은 키값으로 데이터를 입력하게 되면 기존의 데이터를 수정하게 된다.
		table.put("name", "지원자");
		System.out.println("name : " + table.get("name"));
		// 데이터가 같더라도 키값이 다르면 새로 입력이 된다.
		
		Collection col = table.values();
		for(Object o : col) {
			System.out.print(o+" | ");
		}
		System.out.println();
		System.out.println("#Object[] toArray#----------------------");
		Object[] o = col.toArray();
		for(int i = 0 ; i < o.length; i++) {
			System.out.print(o[i] + " | ");
		}
		System.out.println();
		System.out.println("#Iterator#----------------------");
		Iterator itor = col.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		System.out.println("#ArrayList#----------------------");
		ArrayList list = new ArrayList(col);
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+" | ");
		}
		System.out.println();
		System.out.println("#Keys()#----------------------");
		Enumeration en = table.keys();
		while(en.hasMoreElements()) {
			Object key = en.nextElement();
			Object value = table.get(key);
			System.out.print(key + " - "+value+" | ");
			//System.out.print(table.get(key) + " | ");
			//System.out.print(en.nextElement()+ " | ");
		}
		// keySet();
		System.out.println();
		System.out.println("#KeySet()#----------------------");
		Set set = table.keySet();
		for(Object key : set) {
			Object value = table.get(key);
			System.out.print(key + " - "+value+" | ");
		}
		System.out.println();
		System.out.println("#Iterator()#----------------------");
		Iterator itor2 = set.iterator();
		while(itor2.hasNext()) { 
			Object key = itor2.next();
			Object value = table.get(key);
			System.out.print(key + " - "+value+" | ");
		}
		System.out.println();
		System.out.println("#ArrayList()#----------------------");
		ArrayList list2 = new ArrayList(set);
		for(int i = 0; i< list2.size();i++) {
			Object key = list.get(i);
			Object value = table.get(key);
			System.out.print(key + " - "+value+" | ");
			
		}
				
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}

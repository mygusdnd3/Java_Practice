package day23.ex;

/*
 	day23.source.Student
 	데이터를 이볅하는 맵의 문제 07을 TreeMap을 사용해서 처리하세요.......
 	1. 키값을 학생 번호로 하는 방법
 	2. 키값을 학생 이름으로 하는 방법
 */
import day23.source.*;
import java.util.*;

public class Ex02 {

	public Ex02() {
		ArrayList<Integer> no = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			no.add(1001 + i);
		}

		ArrayList<String> name = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			name.add("참이슬");
			name.add("처음처럼");
			name.add("테라");
			name.add("진로");
			name.add("청하");
		}
		
		TreeMap<Integer, Student> map = new TreeMap<Integer, Student>();
		TreeMap<String, Student> mapName = new TreeMap<String, Student>();
		Student std; 
		for (int i = 0; i < 5; i++) {
			int[] rdn = new int[5];

			for (int j = 0; j < rdn.length; j++) {
				rdn[j] = (int) (Math.random() * 100 + 1 - 1) + 1;
			}

			std = new Student(no.get(i), name.get(i), rdn[0], rdn[1], rdn[2], rdn[3], rdn[4]);

			map.put(no.get(i), std);
			mapName.put(name.get(i), std);
			
		}

		Set<Integer> set = map.keySet();
		Iterator<Integer> itor = set.iterator();
		while (itor.hasNext()) {
			int num = itor.next();
			int a =  map.get(num).getDb();
		}
		ArrayList<Integer> lineUpNum = new ArrayList<Integer>(set);
		Collections.sort(lineUpNum);
		for (int i = 0; i < lineUpNum.size(); i++) {
			System.out.println(map.get(lineUpNum.get(i)));
		}
		System.out.println("*****이름순으로 정렬*****");
		Set setName = mapName.keySet();
		ArrayList<String> lineUpName = new ArrayList<String>(setName);
		Collections.sort(lineUpName);
		for (int i = 0; i < mapName.size(); i++) {
			System.out.println(mapName.get(lineUpName.get(i)));
			
		}
		
		

		// TreeMap map = new TreeMap(); // 정렬 되어있지만,,뽑아올때 set으로 해서 씨발라미..

	}

	public void setStd(HashSet set) {

	}

	public static void main(String[] args) {
		new Ex02();
	}

}class Names{
	public Names() {
		
	}
}
class LineUpName{
//	public ArrayList LineUpName(ArrayList no){
//		ArrayList list = new ArrayList(); 
//		TreeMap map = new TreeMap();
//		TreeMap mapName = new TreeMap();
//		Student std; 
//		for (int i = 0; i < 5; i++) {
//			int[] rdn = new int[5];
//
//			for (int j = 0; j < rdn.length; j++) {
//				rdn[j] = (int) (Math.random() * 100 + 1 - 1) + 1;
//			}
//
//			std = new Student(no.get(i), name.get(i), rdn[0], rdn[1], rdn[2], rdn[3], rdn[4]);
//
//			map.put(no.get(i), std);
//			mapName.put(name.get(i), std);
//	}
}

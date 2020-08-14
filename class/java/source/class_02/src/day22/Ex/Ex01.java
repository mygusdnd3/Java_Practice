package day22.Ex;

/*
 	1.
 	삼각형 클래스를 만들고
 	이 클래스가 Set에 담길때 같은 면적이면 같은 클래스로 판정 되도록
 	클래스를 정의하고
 	HashSet에 랜덤하게
 		밑변, 높이 를 만들어서 입력해서 삼각형을 만들고
 		10개를 담고
 	출력하세요
 	2. 밑변이 같은 클래스는 같은 클래스로 판정되도록
 	
 	3. 높이가 같으면 같은 클래스로 판정되도록
 */
import java.util.*;
public class Ex01 {

	public Ex01() {
		//HashSet 만들고 삼각형반환된 값을 저장
		HashSet set = new HashSet();
		for(int i = 0; i <10 ; i++) {
		set.add(getSamgak());
		
		}
		for(Object o : set) {
		System.out.println(o);
		}
		// 수정을위해 ArrayList로 꺼냄
		ArrayList list = new ArrayList(set);
		//밑면을 기준으로 판정되게?????? 판정됬는진 어떻게 확인하지
		
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Samgak)o1).getBottom() - ((Samgak)o2).getBottom()>0?1:-1;
			}
		});
		System.out.println("*******밑변*****");
		for(Object o : list) {
			System.out.println(o);
		}
		
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Samgak)o1).getHight() - ((Samgak)o2).getHight()>0?1:-1;
			}
		});
		
		System.out.println("*******높이정렬***");
		for(Object o : list) {
			System.out.println(o);
		}
	
		
	}	//삼각형 셋팅하고 반환
	public Samgak getSamgak() {
		int a = (int)(Math.random()*50-5+1)+5;
		int b = 5; //(int)(Math.random()*50-5+1)+5;
		Samgak s = new Samgak(a,b);
		System.out.print("밑변===>" + s.bottom);
		System.out.println("높이===>" + s.hight);
		s.setArea();
		return s;
		
	}
	
	

	public static void main(String[] args) {
		new Ex01();
	}

}

package day22;
/*
 	10개릐 문자열 데이터를 입력하고
 	내용을 확인해 보자.
 */
import java.util.*;
public class Test01 {

	public Test01() {
		HashSet set = new HashSet();
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
		set.add("1");
		
		// 저장된 갯수 확인하고
		System.out.println("set.size() : " + set.size());
		
		// 데이터를 꺼내서 출력
		/*
		 	 Set 계열은 데이터를 꺼내는 함수는 존재하지 않는다.
		 	 따라서 Iterator로 변환하던지
		 	 아니면 List 계열로 변환해서 써야 한다.
		 */
		System.out.println("Itorator");
		Iterator itor = set.iterator();
		while(itor.hasNext()) {	//꺼낼 데이터가 남아 있는가
			String name = (String)itor.next();
			//Iterator 에서 데이터를 꺼내는 함수는 next() 함수인데 반환값 타입이 Object 이다.
			System.out.println(name);
		}  
		System.out.println();
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			System.out.println(o);
		}
		System.out.println("sort");
		Collections.sort(list);
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("foreach Set");
		for(Object o : set) {
			System.out.println(o);
		} 
	}

	public static void main(String[] args) {
		new Test01();
	}

}

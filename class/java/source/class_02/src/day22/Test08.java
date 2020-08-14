package day22;

import java.util.*;

/*
 	HashMap에 
 	이름을 키값으로 하고 전화 번호를 value 로 하는 데이터를 다섯개 넣어보자
 */
public class Test08 {

	public Test08() {
		HashMap map = new HashMap();
		map.put("둘리", "010-2222-2222");
		map.put("또치", "010-7777-7777");
		map.put("고길동", "010-1234-5678");
		map.put("도우너", "010-9876-5432");
		map.put("마이콜", "010-8888-5444");
		
		
		/*
		Set set = map.keySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Object key = itor.next();
			Object value = map.get(key);
			System.out.println(key+" : " + value);
		}
		*/
		Set<Map.Entry> set = map.entrySet();
		Iterator<Map.Entry> itor = set.iterator();
		while(itor.hasNext()) {
			Map.Entry data = itor.next(); // Map.Entry 는 VO 클래스로 봐라 VO클래스
			System.out.println(data.getKey() + " : " + data.getValue());
		}
		
		
		
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
/*
class VO{ // < Map.Entry 설명
	private Object key;
	private Object value;
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
*/
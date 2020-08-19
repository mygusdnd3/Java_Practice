package day25;

import java.io.*;
import java.util.*;

public class Test11 {

	TreeMap<String, TreeMap<String, Object>> map;
	// 출력 타겟 스트림 준비
	FileOutputStream fout = null;
	// 출력 보조 스트림 준비
	ObjectOutputStream oout = null;
	// 입력 타겟 스트림 준비
	FileInputStream fin = null;
	// 입력 보조 스트림 준비
	ObjectInputStream ois = null;

	public Test11() {

		map = getFrMap();
		//파일 저장함수 호출
		
		try {
			outMap();
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		//파일 읽기 함수 호출
		try {
			inMap();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
				ois.close();
				fin.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	//파일 내보내기 함수
	public void outMap() throws Exception {
		//타겟 스트림 준비
		fout = new FileOutputStream("src/day25/doc/bolpalgan.cls");
		//보조 스트림 준비
		oout = new ObjectOutputStream(fout);
		
		//데이터 내보내고
		oout.writeObject(map);
	}
	
	//파일 읽기 함수
	public void inMap() throws Exception {
		//타겟 스트림
		fin = new FileInputStream("src/day25/doc/bolpalgan.cls");
		//보조스트림
		ois = new ObjectInputStream(fin);
		//데이터 읽고 
		TreeMap<String, TreeMap<String, Object>> map =
				(TreeMap<String, TreeMap<String, Object>>)ois.readObject();
		//출력하고
		//키들을 뽑아낸다.
		Set<String> set = map.keySet();
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String key = itor.next();
			TreeMap<String,Object> subMap = map.get(key);
			System.out.println(map.get(key));
			
			Set<String> set2 = subMap.keySet();
			//이번엔 Arraylist로 변환
			ArrayList<String> list = new ArrayList<String>(set2);
			for(String subKey : list) {
				Object o = subMap.get(subKey);
				if(o instanceof String) {
					System.out.println(subKey + " : " +o);
				}else if(o instanceof Integer) {
					System.out.println(subKey + " : " +(int)o);
			}
		}
	}
	}

	// 친구들의 정보를 TreeMap에 담아서 반환해 주는 함수
	public TreeMap<String, TreeMap<String, Object>> getFrMap() {
		TreeMap<String, TreeMap<String, Object>> map = new TreeMap<String, TreeMap<String, Object>>();
		// map에 채울 맵 만들기 1
		TreeMap<String, Object> m1 = new TreeMap<String, Object>();
		m1.put("name", "안지영");
		m1.put("age", 26);
		m1.put("mail", "anji@gmail.com");

		map.put((String) m1.get("name"), m1);
		
		
		
		
		//map.put((String)(m1.get("name")), m1);

		m1 = new TreeMap<String, Object>();
		m1.put("name", "우지윤");
		m1.put("age", 26);
		m1.put("mail", "jiwuun@gmail.com");

		map.put((String)(m1.get("name")), m1);

		return map;
	}

	

	public static void main(String[] args) {
		new Test11();
	}

}

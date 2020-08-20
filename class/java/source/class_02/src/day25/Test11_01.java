package day25;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import day25.*;
public class Test11_01 {
	ArrayList<String> names;
	Map<String, Map<String, Test_Score>> map;
	Map<String, Map<String, Test_Score>> getMap;
	// 출력 타겟 스트림 준비
	FileOutputStream fos = null;
	// 출력 보조 스트림 준비
	ObjectOutputStream oos = null;

	// 입력 타겟 스트림
	FileInputStream fis = null;
	// 입력 보조 스트림
	ObjectInputStream ois = null;
	int classNum = 1;

	public Test11_01() {
		
			SetName st = new SetName();
			names = st.setName();
		try {

			fos = new FileOutputStream("D:\\Java_Practice\\class\\java\\source\\class_02\\src\\day25\\doc\\stdScore01.txt");
			oos = new ObjectOutputStream(fos);
			// putName();
			
			for(int i = 0; i< 5; i++) {
			map = getMap(i+1);
			oos.writeObject(map);
			toPrintScore();
			}
			FileCheck f = new FileCheck();
			f.checkFile();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		getMap = (Map<String, Map<String, Test_Score>>) getFile();
	}

	// 학생 이름 초기화블럭
	

	
		
		
	

	// 학생 점수 초기화 블럭
	public Map<String, Map<String, Test_Score>> getMap(int classNum) {
		map = new HashMap<String, Map<String, Test_Score>>();
		Map<String, Test_Score> cls1 = new HashMap<String, Test_Score>();

		int[] score;

		for (int i = 0; i < names.size(); i++) {
			score = new int[names.size()];
			for (int j = 0; j < 4; j++) { // 4회
				score[j] = (int) (Math.random() * 100 - 1 + 1) + 1;
			}
			Test_Score stdScore = new Test_Score(names.get(i), classNum,score);
			//System.out.println(stdScore);
			cls1.put(names.get(i), stdScore);
		}
		map.put(classNum+"반", cls1);

		return map;

	}

	// 학생 점수 출력 블럭
	public void toPrintScore() {
		Set<String> set = map.keySet();
		Iterator<String> itor = set.iterator();
		while (itor.hasNext()) {
			String s = itor.next();
			Map<String, Test_Score> subMap = map.get(s);
			// System.out.println(map.get(s)); 

			Set<String> set2 = subMap.keySet();
			// 이번엔 Arraylist로 변환
			ArrayList<String> list = new ArrayList<String>(set2);
			Collections.sort(list);
			for (String subKey : list) {
				Object o = subMap.get(subKey);
				if (o instanceof Test_Score) {
					//System.out.println(subKey + " : " + o);
					System.out.println(o);
				}
			}
		}
	}
	
	public Object getFile() {
		// 입력 타겟 스트림
		Object o = null;
		try {
			fis = new FileInputStream("D:\\Java_Practice\\class\\java\\source\\class_02\\src\\day25\\doc\\stdScore01.txt");
			ois = new ObjectInputStream(fis);
			o = ois.readObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
		
	}

	public static void main(String[] args) {
		new Test11_01();
	}

}

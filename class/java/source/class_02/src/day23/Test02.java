package day23;

import java.io.*;
import java.util.*;

/*
 	Properties로 Map 데이터를 사용하다가.
 	파일로 저장하도록 하자
 */
public class Test02 {

	public Test02() {
		Properties prop = new Properties();
		prop.put("name", "iu");
		prop.put("age", "28");
		prop.put("tel", "010-1616-2244");
		prop.put("addr", "seoul");
		/*
		 	Properties는 맵의 일종이므로 
		 	맵처럼 작업하면 된다. 
		 	
		 	이것을 보관할 필요가 생기면
		 */
		FileOutputStream fout= null;
		try {
			fout = new FileOutputStream("src/day23/iu.iu");
			//작업 내용을 파일로 보낸다.
			prop.store(fout, "IU Imformation");
			System.out.println("### 파일 저장 완료 ###");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("*** 28번째줄 파일 저장 실패");
		}
		Properties prop1 = new Properties();
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day23/tel.txt");
			//읽은 내용 Properties에 저장
			prop1.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		int data ;
		FileReader fid = null;
		BufferedReader bfd= null;
		try {
			fid = new FileReader("src/day23/tel.txt");
			bfd = new BufferedReader(fid);
			
			String string = new String();
			do {
				string = bfd.readLine();
				System.out.println(string);
			}while(string != null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set set = prop1.keySet();
		for(Object o : set) {
			System.out.println(o+" - "+ prop1.get(o));
		}
		
		
			
		}
	
	

	public static void main(String[] args) {
		new Test02();
	}

}

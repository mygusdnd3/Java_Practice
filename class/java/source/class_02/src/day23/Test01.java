package day23;

import java.util.*;
import java.io.*;
import java.nio.charset.Charset;

/*
 	Sample.txt를 읽어서 Map으로 저장해 보자
 */
public class Test01 {

	public Test01() {
		Properties prop = new Properties();
		/*
		 	외부 파일과 연결할 예정이다. 
		 	이 작업은 이후 이어지는 IO에서 공부할 때 깊게 알아보도록 하자
		 */
		FileInputStream fin = null;
		try {
			//fin = new FileInputStream("src\\day23\\sample_ko.txt");	//주의 파일이 기본UTF-8로 저장이 되있다면 ansi로 변경후 진행
			fin = new FileInputStream("src\\day23\\tel.txt");	//주의 파일이 기본UTF-8로 저장이 되있다면 ansi로 변경후 진행
			/*
			 	경로는
			 	절대경로를 이용해서 
			 		D:\Java_Practice\class\java\source\class_02\src\day23\sample.txt
			 	로 사용해도 된다.
			 	이클립스 안에 데이터를 만들면 이것은 이클립스 자신이 경로를 새롭게 정해서 사용하므로
			 	src 부터 시작하는 경로를 사용하면 된다.
			 */
			// 이제 파일의 내용을 Properties에 옮긴다.
		//	prop.load(new BufferedInputStream(fin));
			prop.load(fin);
			//String site = new String(prop.getProperty("SITE").getBytes("ISO-8859-1"),("UTF-8"));
		//	prop.load(new InputStreamReader(fin, Charset.forName("sample_ko.txt")));
			//파일의 내용을 읽어서 Map으로 처리해 놓았다. 
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//이제부터는 HashMap에 데이터가 저장된것 처럼 사용하면 된다.
		/*
	  	String name = (String)prop.getProperty("hong");
		System.out.println("저장된 이름 : "+name);;
		*/
		Set set = prop.keySet();
		for(Object o : set) {
				System.out.print(o +" | ");
			}
			System.out.println("\n");
			ArrayList list = new ArrayList();
		for(Object o : set) {
			list.add(o+ " - "+ prop.get(o));
			System.out.println(o+ " - "+ prop.get(o));
		}
		System.out.println("list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
		
	

	public static void main(String[] args) {
		new Test01();
	}

}

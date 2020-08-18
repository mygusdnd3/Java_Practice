package day24;

import java.io.*;

/*
 	수업설명 문서가 있는 폴더 내의 파일 목록을 알아내자.
 */
public class Test03 {

	public Test03() {
		// 목록을 알아내고 싶은 폴더를 파일로 만든다.
		File file = new File("D:\\Java_Practice\\class\\java\\source\\class_02\\doc");
		/*
		//이름 목록을 알아낸다.
		String[] fList = file.list();
		//출력한다.
		System.out.println(fList); //<= 이렇게 하면 배열의 주소출력됨
		for(String fName : fList) {
			System.out.println(fName);
		}
		*/
		//이름과 정보도 같이 리스트로 꺼내오는 방법
		/*
		File[] fList = file.listFiles();
		for(File f : fList) {
			File fInfo = f;
			String fName = fInfo.getName(); //파일이름꺼내기
			Long len = fInfo.length();		//파일 크기 꺼내기
			//출력
			System.out.println(fName + " : "+ len+"byte");
		}
		*/
		//확장자가 pdf인 것만 골라서 정보를 출력해 보자
		File[] fList = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				/*
					매개변수 역할
						File dir	- 현재 파일의 정보를 알려준다.
						String name - 현재 파일의 이름을 알려준다. 
					우리는 확장자가 .pdf로 끝나는 파일만 보기를 원한다.
					
					그런데 이 함수(accept())는 자동 호추로디는 함수이다.
					목록을 구하는 파일을 하나씩 발견할 때마다 이 함수가 호출이되고
					이 함수는 true를 반환하면 목록에 포함을 시키고
					이 함수에서 false를 반환하면 목록에서 제외시킨다.  
				*/
				if(name.endsWith("pdf")&&(name.startsWith("Java"))) {	// 파일의 확장자가 pdf이니?
					return true;
				}else {
					return false;
				}
			}// 문제 ]Java01.pdf Java02.pdf Java03.pdf 	Java04.pdf 	Java05.pdf
			//	파일의 정보만 필터를 적용해서 보기원한다.
			
		});
		//출력한다.
//		for(File f : fList) {
//			System.out.println(f.getName());
//		}
		for(int i  = 0; i < fList.length; i++) {
			File f = fList[i];
			//파일 이름 알아내고
			String fName = f.getName();
			//파일 크기 알아내고
			long len = f.length();
			System.out.println(fName +" : " + len + "byte");
		}
		
		File[] fList2 = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith("pdf")&&name.startsWith("Java")) {
					return true;
				} else {
					return false;
				}
			}
		});
		for(File f : fList2) {
			System.out.println(f.getName() +" - " + f.length() +" : "+"쓰기권한"+f.canWrite());
		}
		
		File[] fList3 = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				String tmp = name.substring(4,name.indexOf('.'));
				boolean ck1 = false;
				for(int i = 0; i < tmp.length(); i++) {
					char ch = tmp.charAt(i);
					if(ch >= '0' && ch <='9') {
						ck1 = true;
					}else {
						ck1= false;
					}
				}
				if(name.startsWith("Java")&&(name.endsWith("pdf"))) {
					return true;
				} else {
					return false;
				}	
				
			}
			
		});
	}
	public static void main(String[] args) {
		new Test03();
	}

}

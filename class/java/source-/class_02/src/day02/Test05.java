package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Test05 {
	public static void main(String[] args) {
		// 1. 논리값 참을 저장할 변수를 만들고 선언하고 초기화 하세요
		boolean bool;
		//boolean bool = true;
		bool = true;
		//같은 이름으로 변수를 다시 선언 할 수 없다.
		boolean bool1 = false;
		bool = bool1;
		// ->bool1 : false
		
		// 2. A를 기억 할 변수를 만들고 초기화 하세요.
		char ch = 'A';
		
		char ch1 = (char)65;
		String filePath = "D:\\Java_Practice\\class\\test";
		String fileName = "ChangeUnicode.txt";
		File file = new File(filePath+fileName);
		
		try {
		FileWriter fw = new FileWriter(file);
		
			for(int i=0; i<=122; i++) {
			//System.out.println(i);
			char ch2 =(char)i;
			System.out.println("숫자 :"+i+ " 변환값 :"+ch2);
		fw.write("숫자 :"+i+ " 변환값 :"+ch2);	
			
			}
		fw.close();
		}
		catch (IOException e){
			
		}
	
		
		float num;
		num = 3.14F;  //기본 실수는 double형(정수는 int형) 
					// 리터럴 형변환
		num = (float)3.14; // 강제 형변환
		
		//참고
		// 정수 데이터에 '.'을 붙이면 실수가 된다.
		// 예) 10. => 10.0같은 의미
		
		float num2;
		//num2 = 10.;
		num2 = 10.F;
		
		// "홍길동" 이라는 문자열을 기억할 변수를 선언하고 초기화하세요
		
		String name;
		name ="홍길동";
		String irum = new String("홍길동");
		System.out.println(name +" "+irum);
		
		System.out.println("name == irum : " +(name==irum) );
		//문자열 자체의 비교는 equals() 함수를 사용해서 비교
		System.out.println("name.equals(irum) : " +name.equals(irum));
		System.out.println("\"홍길동\".equals(name) :" + "홍길동".equals(name));
		
		String tmp = "\"";
		//큰따옴표 등의 이스케이프 문자를 사용할시 앞에 \표시를 해준다
		
		
		System.out.print("abcd\n");
		System.out.print("\tefgh");
	}
		
		
}

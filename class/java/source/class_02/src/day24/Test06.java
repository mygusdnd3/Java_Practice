package day24;

import java.io.*;
import java.util.Arrays;

import javax.swing.*;
public class Test06 {

	public Test06() {
		//파일 연결 스트림을 준비한다.
		//이번에는 파일에서 프로그램으로 데이터가 이동하는 방향임으로 Inputstream을 준비해야 한다.
		
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src\\day24\\Test01.java");
//			fin = new FileInputStream("D:\\Java_Practice\\class\\java\\source\\class_02\\src\\day24\\wTest\\FileText.txt");
			/*
			//1. 한글자만 읽어보자.
			int ch = fin.read(); //매개변수없으면 한글자마꺼낸다
			System.out.println("한글자 : "+(char)ch);
			*/
			/*
			//2. 여러글자
			//byte배열 준비
			byte[] buff = new byte[1024];
			//배열을 입력해서 읽는다.
			int len = fin.read(buff);
			String str = new String(buff,0,len);
			//출력
			System.out.println("읽어온 문자열내용 : "+str);
			*/
			//3. 파일의 전체 내용을 읽어보자
			// 파일의 내용은 몇번을 읽어야 할지 알 수 없으므로 반복문으로 처리한다.
			//byte[] 준비하고
			byte[] buff = new byte[1024];
			while(true) {
				//배열 내용 초기화
				Arrays.fill(buff, (byte)0);
				// 스트림에 있는 내용 읽는다.
				int len =fin.read(buff);
				//반환값은 읽은 데이터의 양과 같다.
				if(len == -1) {
					//이 경우는 읽은 데이터의 갯수가 없는 경우이다.
					//이 경우는 다읽은 경우 이므로 반복문을 종료시킨디ㅏ.
					break;
				}
				String str = new String(buff,0,len);
				System.out.print(str);
			}			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
				
				
		
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}

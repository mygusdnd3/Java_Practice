package day24;

import java.io.*;
import java.util.*;
public class Test04 {

/*
 	키보드 역시 외부 장치다.
 	자주 사용하는 외부 장치 이기 때문에 
 	이미 스트림을 준비한 변수가 존재한다.
 	
 		System.in
 */
	
	public Test04() {
		System.out.print("한글자를 입력하세요!");
		int ch = 0;
		try {
			/*
			//1.
			ch = System.in.read();
			// 출력
			System.out.println("입력한 문자 1 : " + ((char)ch));
			System.out.println("입력한 문자 2 : " + (ch));
			*/
		/*
			//2. 여러 문자를 입력받아서 출력해보자.
			// 먼저 읽은 결과를 기억할 변수를 준비
			byte[] buff = new byte[256];
			// 256의숫자에 따라서 한번에 읽은 데이터 양이 정해진다.
			int len = System.in.read(buff); // len - 읽은 데이터 갯수
			String str = new String(buff,0,len);
			System.out.println("입력한 문장 : "+str+len);
			*/
			//3. 여러 문자를 받아서 출
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte)'A');
			for (int i = 0; i < buff.length; i++) {
				if(i < 5 | i > 250) {
					System.out.print(buff[i]+", ");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}

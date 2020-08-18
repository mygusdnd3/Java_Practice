package day24;

import java.io.*;
import java.util.Arrays;

/*
 	doc/청하01.jpg 파일을 복사해본다
 */
public class Test07 {

	public Test07() {
	/*
	 	할일 ]
	 		스트림은 단방향이다.
	 		그런데, 복사라는 개념은 한곳에서 읽어서 
	 		다른곳에 쓰면 된다.
	 		따라서 스트림이 두개가 필요하다.
	 */
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			//스트림 두개를 만든다
			fin = new FileInputStream("C:\\Users\\class02\\Downloads\\Downloads.7z");
			fout = new FileOutputStream("C:\\Users\\class02\\Downloads\\Downloads2.7z");
			// 한곳에서 읽어서 다른곳에 쓰면된다
			//그런데 몇번이 반복이 되어야 할지 모르므로 반복으로 처리한다?
			byte[] buff = new byte[1024000000];
			while(true) {
				//배열 초기화
				Arrays.fill(buff, (byte)0);
				
				//읽은다
				int len = fin.read(buff);
				if(len == -1) {
					//읽은데이터가 없는 경우이므로 종료시킨다
					break;
				}
				//읽은 내용을 쓰면 된다.
				fout.write(buff,0,len);
			}
			System.out.println("파일 복사가 완료괴었습니다.");
				
				
				
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				fin.close();
				
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}

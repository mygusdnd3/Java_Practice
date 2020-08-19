package day25;

import java.io.*;
/*
 	src/doc/fileTest02.txt 파일을 읽어서 - 바이트기반 - 연결스트림 - 문자기반 보조스트림
 	파일을 복사하는데
 		fileTest03.txt
 	을 만드는데, 
 	PrintWriter를 사용해서 처리해보자. 
 */
public class Test08 {

	public Test08() {
		// 바이트 기반 타겟 스트림 준비
		FileInputStream fin = null;
		//연결 스트림 준비하고
		InputStreamReader ir = null;
		//문자기반 필터 스트림 준비하고
		BufferedReader br = null;
		//문자기반 출력스트림 준비하고
		PrintWriter pw = null;
		try {
			fin = new FileInputStream("src/day25/doc/fileTest02.doc");
			
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			pw = new PrintWriter("src/day25/doc/fileTest03.txt");
			
			while(true) {
				String line = br.readLine();
				if(line == null)break;
				
				pw.println(line);
			}
			System.out.println("복사완료");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pw.close();
				br.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}

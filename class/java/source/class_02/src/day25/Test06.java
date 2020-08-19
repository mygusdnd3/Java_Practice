package day25;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
public class Test06 {

/*
 	byte 기반의 스트림을 타겟스트림으로 하고
 	char 기반의 스트림 필터 스트림으로 파일을 읽어보자
 	스트림을 연결한때 주의사항
 		1. 같은 방향 끼리만 연결해야 한다.
 		2. 같은 크기 끼리만 연결해야 한다. 
 	지금의 경우는 
 		타겟은 바이트기반이고 필어는 문자 기반이니
 		두 스트림은 연결해줄 보조 스트림이 필요하겠다. 
 		따라서 
 			InputStreamReader
 		를 사용하면 되겠다.
 */
	public Test06() {
		//타겟 스트림 준비	- 바이트기반
		FileInputStream fin = null;
		// 보조 스트림 준비......	-연결 스트림
		InputStreamReader ir = null;
		//필터 스트림 준비	- 문자 기반
		BufferedReader br = null;
		try {
			//타겟 스트림 만들고
			fin = new FileInputStream("src/day25/Test01.java");
			//연결스트림
			ir = new InputStreamReader(fin);
			//팔터스트림
			br = new BufferedReader(ir);
			String test = "";
			int i = 1;
			while(true) {
				DecimalFormat form = new DecimalFormat("000");
				String sno = form.format(i++);
				String line = br.readLine();
				if(line == null) break;
				System.out.println(sno+line);
				test = test+line+"\n";
			}
		//	System.out.println(test);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				fin.close();
			} catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}

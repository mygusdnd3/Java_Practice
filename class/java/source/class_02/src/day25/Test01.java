package day25;

import java.io.*;

/*
 	PrintStream
 	
 	김소월의 진달래 꽃을 파일에 저장해보자.
 */
public class Test01 {

	public Test01() {
		//변수 선언
		PrintStream ps = null;
		try {
			ps = new PrintStream("src/day25/poem.txt");
			ps.println("진달래 꽃");
			ps.println("--- 김 소 월 ---");
			ps.println();
			ps.println("나보기가 역겨워 가실때에는");
			ps.println("말없이 고이 보내 드리오리다.");
			ps.println();
			ps.println("영변에 약산 진달래 꽃");
			ps.println("아름따다 가신길에 뿌리오리다.");
			ps.println();
			ps.println("가시는 걸음 걸음");
			ps.println("놓인 그 꽃을");
			ps.println("사뿐히 즈려밝고 가시옵소서.");
			ps.println();
			ps.flush();
			// 내부적으로 버퍼를 가지고 있으므로
			// 반드시 내보내기가 끝나면 버퍼를 비워줘야 한다.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		} try {
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

	public static void main(String[] args) {
		new Test01();
	}

}

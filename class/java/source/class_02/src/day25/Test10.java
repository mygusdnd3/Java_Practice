package day25;

import java.io.*;
/*
	friend01.cls 파일을 읽어오자
	ObjectOutputStream 으로 내보낸 데이터는 반드시
	ObjectInputStream 으로 받아야 한다.
	송수신측 모두 똑같은 클래스를 가지고 있어야 한다.
*/	
public class Test10 {

	public Test10() {
		//타겟 스트림 준비 
		FileInputStream fi = null;
		//보조 스트림 준비
		ObjectInputStream oi = null;
		try {
			//스트림 만들고
			fi = new FileInputStream("src/day25/doc/friend01.cls");
			oi = new ObjectInputStream(fi);
			//데이터 만들고
			Friend fr = (Friend)oi.readObject();
			System.out.println(fr);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oi.close();
				fi.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
			
	}

	public static void main(String[] args) {
		new Test10();
	}

}

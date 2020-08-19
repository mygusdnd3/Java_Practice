package day25;

import java.io.*;
/*
 	Friend 데이터를 파일(Friend01.txt)로 저장해보자.
 */
public class Test09 {

	public Test09() {
		//타겟 스트림 준비
		FileOutputStream fout = null;
		//필터 스트림 준비
		ObjectOutputStream oout = null;
		
		// 친구 데이터 준비하고
		Friend fr = getfr();
		
		try {
			// 스트림 만들고
			fout = new FileOutputStream("src/day25/doc/friend01.cls");
			oout = new ObjectOutputStream(fout);
			
			//데이터 내보내고
			
			oout.writeObject(fr);
			//이처럼 클래스 전체를 출력하는 행위를 직렬화라고 한다.
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
	/*this.name = name;
	this.age = age;
	this.height = height;
	this.gen = gen;
	this.mail = mail;
	this.tel = tel;
	*/
	//내 친구 안지영 반환해 주는 함수
	public Friend getfr() {
		Friend fr = new Friend("안지영",28,165.4,'F',"anjiyoung@gmail.com","010-2344-3222");
		return fr;
	}

	public static void main(String[] args) {
		new Test09();
	}

}

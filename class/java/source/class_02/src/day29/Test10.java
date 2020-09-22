package day29;

import day29.thread.*;
public class Test10 {
	public int num ; //기본 데이터타입 멤버 변수는 자동 초기화가 된다. 
	
	public Test10() {
		//new Born
		Trd101 t1 = new Trd101(this);
		Trd102 t2 = new Trd102(this);
		
		//Runnable
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test10();
	}

}

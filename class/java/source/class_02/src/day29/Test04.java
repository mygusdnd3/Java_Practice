package day29;

import day29.thread.*;
public class Test04 {

	public Test04() {
		Trd04 tmp = new Trd04();
		// tmp는 아직 스레드가 아니다.
		// 따라서 강제로 Thread로 만들어 줘야 한다.
		Thread t1 = new Thread(tmp, "장성환");
		Thread t2 = new Thread(tmp, "이지우");
		// Runnable -> Run으로 
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test04();
	}

}

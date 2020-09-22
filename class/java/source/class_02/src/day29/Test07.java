package day29;

import day29.thread.*;
public class Test07 {

	public Test07() {
		Trd07 t1 = new Trd07(); // New Born 상태
		t1.start(); //Runnable상태
		
		for(int i = 0 ; i< 2; i++) {
			System.out.println("반장님이 아이스크림사다라고 조릅니다. -"+(i+1));
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// 이 라인을 실행한다는 것은 프로세스 프로그램의 내용을 모두 실행한 경우이므로
		// 여기서 스레드를 종료시킨다.
		t1.stop();
		
	}

	public static void main(String[] args) {
		new Test07();
		System.out.println("프로그램 종료");
	}

}

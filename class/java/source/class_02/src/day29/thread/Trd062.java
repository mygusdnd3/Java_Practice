package day29.thread;

public class Trd062 implements Runnable {

	public void run() {
		for(int i = 0 ; i < 1000 ; i ++) {
			System.out.println("영선씨가 티라미수 사줍니다."+(i+1));
			// 한번 출력하면 비록 시간이 남았지만..
			// 이번에는 아예 block 상태로 보낸다.
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}
}

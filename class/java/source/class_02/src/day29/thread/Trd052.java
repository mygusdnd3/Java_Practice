package day29.thread;

public class Trd052 extends Thread {

	public void run() {
		for(int i = 0 ; i< 1000; i++) {
			System.out.println("수진씨가 쿠키 쏩니다. - "+(i+1));
			// 한번 출력 했으니
			// 다른 프로그램으로 양보하세요
			//==> Runnalbe 상태로 돌아가세요
			yield();
		}
		}
}

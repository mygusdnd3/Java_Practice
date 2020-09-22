package day29.thread;

import day29.*;
public class MyThread03 implements Runnable {
	MyTest main;
	public MyThread03(MyTest main) {
		this.main = main;
		
	}
	public void run() {
		for(int i = 0 ; i <1000; i++) {
		System.out.println("확인");
		if(main.abc_isStart == false) {
			main.abc_isStart = true;
			main.abc();
			main.abc_isStart = false;
			System.out.println(Thread.currentThread() +" 사용종료");
		}else if(!main.xyz_isStart) {
//		}else if(main.xyz_isStart == false) {
			main.xyz_isStart = true;
			main.xyz();
			main.xyz_isStart = false;
			System.out.println(Thread.currentThread() +" 사용종료");
		}
		}
	}

}

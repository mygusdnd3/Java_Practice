package day29;

import day29.thread.*;
public class MyTest {

	public Boolean abc_isStart = false;
	public Boolean xyz_isStart = false;
	public MyTest() {
		MyThread01 t1 = new MyThread01(this,"김개똥");
		MyThread02 t2 = new MyThread02(this,"김소똥");
		MyThread03 ti = new MyThread03(this);
		Thread t3 = new Thread(ti);
		
		t1.start();
		t2.start();s
		t3.start();
		
		
	}
	
	public void abc() {
		String name = Thread.currentThread().getName();
		for(int i = 0 ; i<10000; i++) {
		System.out.println(name +" 사용자 abc스레드 사용중");
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void xyz() {
		String name = Thread.currentThread().getName();
		for(int i = 0 ; i<10000; i++) {
		System.out.println("\t\t"+name +" 사용자 xyz스레드 사용중");
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	public static void main(String[] args) {
		new MyTest();
	}

}

package day29.thread;

import day29.*;
public class Trd122 extends Thread {
	Test12 main;
	
	public Trd122(Test12 main, String name) {
		super(name);
		this.main = main;
	}
	
	@Override
	public void run() {
		if(main.abc_isStart == false) {
			main.abc_isStart = true;
			main.abc();
			main.abc_isStart = false;
		} else if(main.xyz_isStart == false) {
			main.xyz_isStart = true;
			main.xyz();			
			main.xyz_isStart = false;
		}
	}
}

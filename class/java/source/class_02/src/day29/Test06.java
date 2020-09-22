package day29;
import day29.thread.*;
public class Test06 {

	public Test06() {
		Trd061 t01 = new Trd061();
		Trd062 t02 = new Trd062();
		
		//new Born
		Thread t1 = new Thread(t01);
		Thread t2 = new Thread(t02);
		
		// Runable
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test06();
	}

}

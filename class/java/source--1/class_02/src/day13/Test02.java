package day13;

import java.util.HashSet;
import java.util.Iterator;

public class Test02 {
	
	static final int num = 10;
	int no = 100;
	
	public static void main(String[] main) {
		System.out.println(Test02.num);
//		System.out.println(no));
		
		Test02 t = new Test02();
		System.out.println(t.no);
		Test02 t1 = new Test02();
		t1.num = 2;
		System.out.println(t1.num);
		System.out.println(t.num);
		
		
		new Test02_01();
		System.out.println("Test02 main :"+Test02.num);
		System.out.println("t1 main :"+t1.num);
	}
}

class Test02_01{
	public Test02_01() {
		Test02.num = 20;
		System.out.println("test02_01 Test02.num: " +Test02.num);
	}
}
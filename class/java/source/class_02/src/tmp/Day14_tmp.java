package tmp;

import day15.MainTest;

public class Day14_tmp {

	public Day14_tmp() {
	}

	public static void main(String[] args) {
		/*
		A a = new A();
		B b = null;
		b = (B)a;
		
		b.toPrint();
		b.Shout();//
		*/
//		B b = new B(); //
//		A a = null; 
//	//	a.shout();
//		b.toPrint();
//		a = b;
//		a = b;	
//		a.Shout()
//		b = (B)a;	// a는 null의 상태
//		b.toPrint();
//		b.toPrint();
		
		A aa = new A();
		B bb = new B();
		aa = bb;
		aa.toPrint(bb);
		
		
		
				
	}
	public void xyz(A t) {
		t.abc();
	}
}

class A {
	int a;
	int b;
	int c;
	public void toPrint(A a) {
		System.out.println("A");
	}
	public void abc() {
		
	}
}

class B extends A {
	public void toPrint(A a) {
		System.out.println("왈왈");
	}

	
}
class C extends A{
	public void toPrint(A a){
		System.out.println("**");
	}
}

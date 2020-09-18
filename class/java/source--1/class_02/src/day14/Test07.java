package day14;


import day14.sub.*;
public class Test07 extends Class02{
	String cName ="test07";
	public Test07() {
//		1.
//		Class00 c1 = new Class00();
//		System.out.println(c1.getNo());
		
//		2.
//		Class01 c2 = new Class01();
//		int num = c2.no;
		
		Class02 c3 = new Class02();
		String className = super.cName;
		//c3.toPrint();
		System.out.println(System.identityHashCode("super를 사용함 :" +super.cName));
		System.out.println(System.identityHashCode("this를 사용함 :"+this.cName));
		System.out.println(System.identityHashCode("그냥 :"+ cName));
		System.out.println(super.cName);
		System.out.println(this.cName);
		System.out.println(cName);
	}

	public static void main(String[] args) {
		new Test07();
	}

}

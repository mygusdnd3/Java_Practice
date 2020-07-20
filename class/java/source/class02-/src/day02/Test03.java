package day02;

public class Test03 {
	public static void main(String[] args) {
//		Test02 t2 = new Test02();
//		t2.toPrint();
//		
		new Test02().toPrint();
		
		Test03_01 t01 = new Test03_01();
		
		//'.' 은 소속을 밝혀줄 때 사용한다.
		System.out.println("Test03_01.no: "+new Test03_01().no);
		System.out.println(("Test03_02.no: "+new Test03_02().no));
		System.out.println("T01.no: "+t01.no);
		System.out.println(("t01.no2: "+t01.no2));
		System.out.println();
		
		int no = 10;
		double d = 3.14d;
		
		double a = no+d;
		System.out.println(a);
		int b  = (int)d;
		System.out.println(b);
		System.out.println();
	}
}

class Test03_01{
	int no = 10;
	double d = 3.14d;
	int no2 =300;
	
}

class Test03_02{
	int no = 20;
	
}

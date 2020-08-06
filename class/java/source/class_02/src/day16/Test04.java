package day16;

public class Test04 {

	public Test04() {
		Inner03 in03 = new Inner03();
		//LocalClass l1 = new localClass(); 
		in03.xyz();
	}

	public static void main(String[] args) {
		new Test04();
	}

}


class Inner03{
	int no = 100; // 전역
	void abc() {
		System.out.println("여기는 Inner03");
		
	}
	void xyz() {
		int num = 55;	//지역
		class LocalClass{
			int soo = 1000;
			
			int odd() {
				System.out.println("Inner03.xyz.LocalClass");
				return soo;
			}
		}
		
		int num2 = new LocalClass().odd();
		System.out.println("xyz.localclass.odd"+num2);
	}
}

package day16;

public class Test02 {
	
	public Test02() {
		Test02_01 t1 = new Test02_01();
		Test02_01.Inner01 in01 = t1.new Inner01();
		in01.xyz();
	}

	public static void main(String[] args) {
		new Test02();
	}

}


class Test02_01{
	int no = 100;
	void abc() {
		System.out.println("여기는 Test02_01");
		//new Inner01().xyz();
	}
	
	class Inner01{
		int num = no*2;
		void xyz() {
			System.out.println("여기는 Inno01");
		}
	}
}

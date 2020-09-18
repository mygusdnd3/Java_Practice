package day10;

public class Test01 {
	int result = 0;

	Test01() {
		int no1 = (int) (Math.random() * 1000);
		int no2 = (int) (Math.random() * 1000);
		System.out.println("생성된 랜덤 수: " + no1 + "| 생성된 랜덤 수2: "+no2); 
		result = duhagi(no1, no2);
		 
		 System.out.println("두개의 합"+result);
	}

	public int duhagi(int a, int b) {

		result = a + b;
		
		return result;
	}

	public static void main(String[] args) {
		new Test01();
		Test01 t1 = new Test01();
		System.out.println(t1.duhagi(1, 2));
		
	}

}

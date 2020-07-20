package my_practice;

public class P_3 {

	private static Test a;

	public static void main(String[] args) {
		Two t = new Two();
		t.add(a);
		

	}

}

class Buyer {
	int money;
	int buyPoint;
}

class Two{
	void add(Test a) {
		System.out.println("Test 출력");
	}
}

class Test{
	int price;

	Test(int price){
		this.price =price;
	}
}

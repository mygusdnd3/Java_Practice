package my_practice;

interface InterTest {
	static final int A = 1000;
	int getA();
}

class InterTestEx implements InterTest {
	public int getA() {
		return A;
	}
}

public class Inter_Test {

	public static void main(String[] args) {
		InterTestEx it1 = new InterTestEx();
		System.out.println("getA(): "+it1.getA());
	}

}

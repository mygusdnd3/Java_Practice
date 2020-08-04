package my_practice;

public class P_Pravate {

	
	public static void main(String[] args) {
		Temp t = new Temp();
		
//		t.a = 10;
//		t.setB(20);
//		System.out.println(t.getB());
//		System.out.println("callTemp");
//		t.callTemp();
		
		new Temp(5,6);
		new Temp2();
		
	}

}

class Temp{
	
	
	int a;
	private int b;
	
	
	

	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}
	
	public void callTemp() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public Temp() {
		
	}
	public Temp(int a , int b) {
		this.a = a;
		this.b = b;
		callTemp();
	}
}


class Temp2 extends Temp{
	
	public Temp2() {
	//	this.b = 30; // 호출 안됨.
		callTemp();
	}
	
}

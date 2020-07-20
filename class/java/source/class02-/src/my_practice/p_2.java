package my_practice;

public class p_2 {
	public static void main(String[] args) {
	//CarUtil cu = new CarUtil();
	Car car1 = new Car();
	CarUtil c2 = (CarUtil)car1;
	car1 = new CarUtil();
	car1.Engine = false;
	CarUtil c3 = (CarUtil)car1;
	c3.Light = false;
//	c2.Engine = true;
//	c2.sound();
//	
//	System.out.println(car1.Engine);
//	System.out.println(c2.Engine);
//	
	
	
		
	}
}

class Car{
	boolean Engine;
	boolean Light;
}

class CarUtil extends Car{
	void sound() {
		"빵빵";
	}
	
}

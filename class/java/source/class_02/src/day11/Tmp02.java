package day11;



class ClassA{
	static int a;
	ClassA(){
		a+=1;
	}
}

class ClassB{
	ClassB(){
		ClassA.a += 1;
	}
}
public class Tmp02 {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassA.a +=1;
		
		System.out.println("ClassA.a의 값 ==>"+ClassA.a);
		


	}

}

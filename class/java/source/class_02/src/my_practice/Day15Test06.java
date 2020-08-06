package my_practice;



public class Day15Test06 {

	int a;
	int b;

	public Day15Test06() {
		//Day15Test06 t1 = new Day15Test06(); 
		TestA a = new TestA(this);	 // 외부 클래스에 Day15Test06 타입의 값 전달
										
		System.out.println(this.a);				
		abc(new Ifc() {
			@Override
			public void add() {
				System.out.println("무명의 클래스 호출");
			}
		});
		
		abc(new Ifc(){

			@Override
			public void add() {
				System.out.println("123");
			}
			
		});
		
		attack(new Tmp1() {
			@Override
			public void attack() {
				System.out.println("attack");
			}
		});
		
		
	}
	
	public void attack(Tmp1 a) {
		a.attack();
	}

	public static void main(String[] args) {
		new Day15Test06();
	}
	
	public void abc(Ifc i) {
		i.add();
	}
	
	public void xyz(Ifc i) {
		i.add();
	}

}
interface Tmp1{
	void attack();
}

interface Ifc {
	void add();
	//void toPrint();
	
}

class TestA {

	Day15Test06 main;//Test06 타입의 전역변수 생성 후 기존의 셋팅값 전달.접근

	TestA() {

	}

	TestA(Day15Test06 a) {
		this.main = a;
		setMain();			//메인의 값 세팅
	}
	
	public void setMain() {
		main.a = 10;
		
	}

}


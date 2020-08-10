package day18;

public class Test02 {

	public Test02() {
		try {
			abc();	// 이 함수는 예외를 전이하는 함수이므로
			//함수를 호출한 곳에서 예외처리를 해주어야한다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void abc() throws Exception {
		Test02_01 t1 = new Test02_01();
		
		try {
			t1.createExcpt();	// 이 함수는 예외를 전이하는 함수이므로
			//함수를 호출한 곳에서 예외처리를 해주어야한다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Test02_02 t2 = new Test02_02();
		t2.createExcpt();//예외 클래스가 RuntimeException하위라면 해도그만안해도그만이라
							// 줄이 안간다.
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Test02_01{
	public void createExcpt() throws Exception{
		System.out.println("여기는 test02-01");
		throw new Exception();//강제로 예외를 발생했으니, 이 라인이 실행이 되면 무조건
		//예외가 발생한다.
	}
} 

class Test02_02 extends Test02_01{
	public void createExcpt() throws NumberFormatException{
		System.out.println("여기는 test02-01");
		throw new NumberFormatException();//강제로 예외를 발생했으니, 이 라인이 실행이 되면 무조건
		//예외가 발생한다.
	}
	
}
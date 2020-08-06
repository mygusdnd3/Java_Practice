package day16;

/*
 	Top level inner class
 */
public class Test03 {

	public Test03() {
		System.out.println(Inner02.no);
		Inner02.abc();
		
	//	Inner02.TopIn iTop = new Inner02.TopIn(); // static Inner Class
		Inner02.TopIn iTop = new Inner02().new TopIn(); // Inner Class      바깥 클래스는 new시켜주긴해야되네?
		iTop.xyz();
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}


class Inner02{
	int num;
	static int no = 10;	// static 영역에 Inner02 int no  = 10;라는 내용이 그대로 올라간다.
	static void abc() { //함수도 마찬가지고
		System.out.println("여기는 Inner02");
	}
	
//	Static class TopIn {
	class TopIn{		//클래스에 static을 붙이면 내부 정의가 올라가는거지
		int no = 10;		// 클래스를 new시킨것처럼 클래스자체가 올라가지않는다.
		void xyz() {
			System.out.println("topIn.xyz");
		}
	}
}


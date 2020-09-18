package day14;

import static java.lang.Math.*;

public class Test01 {

	public Test01() {
		Test01_01 t1 = new Test01_01();
		System.out.println(t1.no);
		System.out.println(t1.getRndm());
		System.out.println(t1);//
		//변수를 바로 출력하게되면 해당 변수가 가지고 있는 toString함수가 출력된다.
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}


class Test01_01{
	int no = 100;
	public  int getRndm() {
		return (int)(random()*13+3); //3부터 15 // 15-3+1+3
	}
	public String toString() {
		return "이 클래스는 변수 no가 "+no+ 
				"이고 getRndm()를 맴버로 가지는 Test01_01 클래스입니다" ;
	}
}

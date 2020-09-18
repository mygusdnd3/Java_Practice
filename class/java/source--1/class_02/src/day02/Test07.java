package day02;

/*
 * 
 * 밑변이 10이고 높이가 5인 삼각형의 넓이를 기억할 변수를 만들고
 * 초기화 하세요.
 * 밑변과 높이의 변수도 선언하고 초기화 하세요.
 * 
 * 공식]
 * 		삼각형의 넓이 = 밑변 * 높이 * 1/2
 */
public class Test07 {
	public static void main(String[] args) {
		int under = 5;
		int hight = 5;
		//int tri = (under*hight)/2;
		double area = under*hight*0.5;
		//
		/*
		 * double  area = unber*hight*(1./2);
		 * 1 / 2 ==> 0 : 정수아 정수의 연산 결과는 정수가 되기 때문에
		 * 1. /2 ->1.0 double 타입의 데이터
		*/
		System.out.println(area);
	}
}

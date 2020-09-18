package day05;

/*
 *  문제 6]
 *  
 *  	수학 방정식
 *  		2x + 4y = 10
 *  	의 결과를 출력
 *  
 *  	단, x,y 는 모두 0보다 크거나 같고 10보다 작거나 같다.
 *  
 *  	
 *  	
 */
public class Ex06 {

	public static void main(String[] args) {

		int x = 2;
		int y = 4;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				result = (x * i) + (y * j);
				if (result == 10) {
					if ((i >= 0 && j <= 10)) {
						System.out.println(x+"+("+i+")+"+y+"("+j+") = "+result);
					} else {
						break;
					}
				}
			}
		}
	}
}

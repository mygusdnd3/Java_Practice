package day06;

/*
 *  반복문 문제
 *  	문제4]
 *  
 *  					0부터 n 까지 합 구하는 공식
 *  					n * (n+1)/2
 *  	1 					0+1
 *  	2  3				1+1
 *  	4  5  6				3+1
 *  	7  8  9  10			6+1
 *  	11 12 13 14 15		10+1
 */
public class Ex04 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 5; i++) {
			
			for(int j = 0; j<=i; j++) {
				
				int num = i*(i+1)/2 +1;
				System.out.println();
			}
			System.out.println();
		}
	}
}

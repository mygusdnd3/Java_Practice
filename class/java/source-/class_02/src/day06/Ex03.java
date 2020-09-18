package day06;

/*
 * 반복문 문제
 * 		문제 3]
 * 
 * 		 1  2  3  4  5 		i =1
 * 		 6  7  8  9  10		i = 6
 * 		 11 12 13 14 15		i =11
 * 		 16 17 18 19 20
 * 	 	 21 22 23 24 25
 * 		 26 27 28 29 30
 */
public class Ex03 {
	public static void main(String[] args) {
		
		for(int i = 0; i<6; i++) {
			for(int j=1; j<=5; j++) {
				
				System.out.print((i*5)+(j)+"\t");
			}System.out.println();
		}
		
	}
}

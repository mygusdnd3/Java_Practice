package my_practice;

/*
 * 	숙제 01]
 * 		 *** 2 단 ***
	 2 x  0 =  0
	 2 x  1 =  2
	 2 x  2 =  4
	 2 x  3 =  6
	 2 x  4 =  8
	 2 x  5 = 10
	 2 x  6 = 12
	 2 x  7 = 14
	 2 x  8 = 16
 */
public class HomeWork01 {
	public static void main(String[] args) {
		for (int line = 0; line < 4; line++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.println("\t *** " + dan + " 단 ***");
				
				for (int i = 0; i < 9; i++) {

					System.out.printf("\t%2d x %2d = %2d\n", dan, i, dan * i);
				}
				
			}
		}
	}
}

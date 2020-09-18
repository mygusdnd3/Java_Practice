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
		for(int i = 2; i<10; i++) {
			System.out.print("\t***"+i+"단***" );
		}
		System.out.println();
		for(int j = 2; j<10;j++) {
			for(int k = 2; k<10; k++) {
				System.out.print("\t"+k+"x"+j+"="+j*k+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}

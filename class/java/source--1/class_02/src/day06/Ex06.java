package day06;

/*
 * 		*  	 
 * 	   **	 
 *    ***	 
 *   ****	 
 *  ***** 	 
 */
public class Ex06 {
	public static void main(String[] args) {

		
		//5번이돌고 4번으로 줄고
		for(int i = 0; i<5; i++) {
			for(int j= 5; j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <=i; k++) {
			System.out.print("*");
			}System.out.println();
		}
		
		
		/*for (int i = 5; i >= 0; i--) {
			
			for(int k = 5; k >0 ; k--) {
				System.out.print("*");
			}
			System.out.print(i);
			System.out.println();
		}*/
//			for (int j =5; j >= i; j--) {
//				System.out.print("");
//			}System.out.println();
		
	}
}

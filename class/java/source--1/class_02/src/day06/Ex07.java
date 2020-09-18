package day06;
	/* 
	*****
	 ****
	  ***
	   **
	    *


	    */
public class Ex07 {
	public static void main(String[] args) {
		
		//공백을 1번 별을 5번
		for(int i = 0; i<5;i++) {
			//공백을 1번
			for(int j =0; j<=i; j++) {
				System.out.print(" ");
			}
			//별을 5번
			
			for(int k = 5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package my_practice;

import java.util.Arrays;

public class P_lotto {

	public static void main(String[] args) {
		// 로또는 6개숫자 5번이 1장
		int[][] lotto = new int[5][6];
		
		
		for(int i = 0; i<lotto.length; i++) {
			loop:
			for(int j = 0; j < lotto[i].length; j++) {
				int number = (int)(Math.random() * 45)+1;
				
				//중복
				for(int k = 0; k<j; k++) {
					if(lotto[i][k] == number) {
						j--;
						continue loop;
					}
				}
				lotto[i][j] = number;
			}
		}
		for(int[] arr : lotto) {
			System.out.println(Arrays.toString(arr));
			
		}
		System.out.println("-------------");
	}

}

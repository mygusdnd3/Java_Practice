package my_practice;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// 로또는 6개의 번호 5개가 1장
		int[][] lotto = new int[5][6];
		
		for(int i = 0 ; i < lotto.length; i++) {
			loop:
			for(int j =0; j <lotto[i].length; j++) {//6 총 5번돈다
				int no= (int)(Math.random() * 45 +1);
				
				for(int k = 0; k <j; k++) { //총 4번
					if(lotto[i][k] == no) {//0,1/1,2/2,3/3,4/4,5/
						j--;
						continue loop;
					}
					lotto[i][j] = no;
				}
				
			}
		}
	

	}

}

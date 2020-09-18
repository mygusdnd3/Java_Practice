				package day07;

import java.util.Arrays;

/*
 *  1~45 까지의 숫자를 랜덤하게 6개를 관리할 배열을 5개 관리할 배열을 
 *  만들고. 출력하세요
 */
public class Test07 {
	public static void main(String[] args) {
		
		int[][] lotto = new int[5][6];
		
		
		//for(int x)
		for(int i =0; i <lotto.length;i++) { //int[5][6] 앞은 배열 뒤는 정수
			
			loop:			
			for(int j = 0; j < lotto[i].length;j++) {
				int no = (int)(Math.random() * 45 +1);
				
				//중복 검사
				for(int k = 0; k < j; k++) {
					if(lotto[i][k] == no) {
						j--;
						continue loop;
					}
				}
				lotto[i][j] = no; //i 번째 방의 j 에게
			//System.out.println(no);	
			}
			//정렬한다.
			for (int l = 0; l < lotto[i].length - 1; l++) { //마지막꺼는 꺼내도 비교할 대상이 없다.
				for(int m = l+1; m < lotto[i].length;m++) {//현재 꺼내온거보다 1이 큰거랑 비교..마지막꺼까지
					if(lotto[i][l] >lotto[i][m]) {
						int tmp = lotto[i][l];
						lotto[i][l] = lotto[i][m];
						lotto[i][m] = tmp;
					}
				}
					
			}
		}
		
		// 출력한다
		for(int[] arr :lotto) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("--------------------------");
		// 하나씩 꺼내서 출력
//				for(int i = 0 ; i < lotto.length ; i++	) {
//					for(int j = 0; j < lotto[i].length; i++) {
//						System.out.print((j+1)+ " 번째 게임 : ");
//						for(int k=0; k< lotto[i][j].) {
//							
//						}
//					}
//				}
		}
	}
	

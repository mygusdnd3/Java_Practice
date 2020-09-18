package tmp;

import java.util.Arrays;

public class Array_Lineup {

	public static void main(String[] args) {
		int[][] no = new int[][]
				{ { 50, 0 }, { 60, 0 }, { 45, 0 }, { 80, 0 }, { 65, 0 } };

		System.out.println(Arrays.deepToString(no));
		
		for (int rank = 1; rank < no.length + 1; rank++) { //5+1? 아 Rank가 1부터 시작
			int idx = 0;
			int tmp = 0;
			for (int i = 0; i < no.length - 1; i++) {
				tmp = no[i][0];	//앞숫자
				System.out.println("no[i][0]====>"+tmp);
				if (no[i][1] != 0) { 
					continue;
				}
				idx = i; 
			
				for (int j = i + 1; j < no.length; j++) {
					if (no[j][1] != 0) {
						continue;
					} else if (tmp < no[j][0]) {
						tmp = no[j][0];
						idx = j;
					}
				}
				break;
			}	System.out.println(rank);
			no[idx][1] = rank;
		}
		System.out.println(Arrays.deepToString(no));
	}

}

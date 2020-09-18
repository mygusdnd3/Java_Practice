package my_practice;

import java.util.Arrays;

public class P_ArrayCopy {

	public static void main(String[] args) {
		int[][] a = new int[5][6];
		
		int[][] c = new int[a.length][a[0].length];
		int[][] d = new int[3][3];
		String[] s = new String[] {"가","나","다","라","마"};
		for(int i = 0 ; i<a.length; i++) {
			for(int j = 0 ; j<a[0].length; j++) {
				a[i][j] = j;
			}
		}for(int[] arr : a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("========");
		
		System.out.println("초기화된 c의 값");
		for(int[] arr : c) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("============");
		System.out.println("Arraycopy : ");
		System.arraycopy(a,0, c, 0, c.length);
		for(int[] arr : c) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("=====d");
		System.arraycopy(a, 3, d, 0, 1);
		for(int[] arr : d) {
			System.out.println(Arrays.toString(arr));
			
			
		}
		
		
		
		System.out.println("----");
		String[] sn = new String[2];
		System.arraycopy(s, 0, sn, 1, sn.length);
		for(String arr : sn) {
			System.out.println(Arrays.toString(arr));
		}
	}

}

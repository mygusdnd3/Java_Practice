package my_practice;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Tmp02 {
	public static void main(String[] args) {
		String test = "10/20/30/40";

		
		int tmp2;
		int[][] arr = new int[5][4];
		for (int i = 0; i < arr.length; i++) {
			String tmp = test;
			String tmp3 = " ";
			loop:
			for (int j = 0; j < 4; j++) {
				
				int idx = tmp.indexOf('/');
				int lidx = tmp.indexOf('/');
				tmp2 = Integer.parseInt(tmp.substring(0, idx));
				tmp3 = Integer.parseInt();
						
						
				
				
				System.out.println("tmp2 " + tmp2 + " tmp |" + tmp);
				
				}
			System.out.println("--------------------------------");
//				
//				if(tmp.substring(idx + 1) == null) {
//					break;
//				}
//				arr[i][j] = tmp2;
//				

		
		}
	}
}
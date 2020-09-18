package my_practice;

import javax.swing.JOptionPane;

public class Tmp03 {

	public static void main(String[] args) {
		String str = "10/20/30/40";
		int[][] arr = new int[5][4];
		for (int i = 0; i < arr.length; i++) {
			str = JOptionPane.showInputDialog("점수");
			for (int j = 0; j < arr[i].length; i++) {
				
				int idx = str.indexOf("/");
				String tmp = str;
				 
				arr[i][j] = Integer.parseInt(tmp.substring(0, idx)); 
/*
				tmp = tmp.substring(idx + 1);
				String oracle = tmp.substring(0, idx);

				tmp = tmp.substring(idx + 1);
				String html = tmp.substring(0, idx);
				tmp = tmp.substring(idx + 1);
				String jsp = tmp.substring(0);

				System.out.println(java);
				System.out.println(oracle);
				System.out.println(html);
				System.out.println(jsp);
				
	*/
				System.out.println(arr[i][j]);
			}
		}
	}

}

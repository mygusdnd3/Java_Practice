package day10;

import javax.swing.JOptionPane;

/*
 	문제 2]
 	
 		1차 배열에 4과목의 점수를 입력한 후
 		총점과 평균을 구하는 프로그램을 작성하세요.
 		
 		 단, 입력, 총점계산, 평균계산 출력은 함수를 작성해서 처리하세요.
 		 
 	
 */

public class Ex02 {

	int[] arr;
	int total = 0;
	
	public Ex02() {
		setarr(4);
		calc();
		total();
		//average(total);
		System.out.println("입력하신 점수의 총점 은 :" + total
				+ "이며  평균은"+ average(total) + "입니다.");
		//JOptionPane.showInternalMessageDialog(null, "입력하신 점수의 총점 은 :" + total
		//5+ "이며  평균은"+ average(total) + "입니다.");
	}

	public void setarr(int set) {
		arr = new int[set];
	}

	// 점수 입력
	public void calc() {
		for(int i = 0; i<arr.length;i++) {
		int jumsu = Integer.parseInt(JOptionPane.showInputDialog(i+1+" 번째 점수를 입력하세요"));
		
		arr[i] = jumsu;
		
		}
	}
	//총점 계산
	public void total() {
		for(int i = 0 ; i< arr.length; i++) {
			total += arr[i];
		}
	}
	//평균계산
	public double average(double a) {
		return total / arr.length;
	}
	

	public static void main(String[] args) {
		int a = 75000;
		
		new Ex02();
	}

}

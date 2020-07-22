package day04;

import java.util.*;

/*
 *  랜덤하게 두자리 숫자를 발생 시키고
 *  키보드로 두자리 숫자를 입력하면 발생된 숫자보다 입력한 숫자가 큰수인지 아닌지
 *  판별해주는 프로그램을 작성하세요.
 *  심화 ]
 *  	입력한 수와 차는 얼마인지
 */

import javax.swing.*;
public class Ex01 {

	public static void main(String[] args) {
		 int rand = (int)(Math.random()*(99-10+1)+1);
		 System.out.println(rand);
		 String snum = JOptionPane.showInputDialog("비교하고 싶은 두자리 숫자를 입력하세요");
		 JOptionPane.showMessageDialog(null, "입력한 숫자 :" +snum);
		 
		 int num = Integer.parseInt(snum);
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자 입력 : ");
		 //int num = sc.nextInt();
		
		 String result = (rand >num )? //랜덤이 더 크냐?
				 		(rand-num+"만큼 랜덤 숫자가 더 크다.")
				 		:(num-rand)+"만큼 입력한 숫자가 더크다";//참
		 
	
		 System.out.printf("입력한 숫자는 [%d]이며 랜덤 숫자는 [%d]이기 때문에 , %s", num, rand, result);
		 
		 

	}

}

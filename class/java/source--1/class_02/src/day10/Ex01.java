package day10;

import javax.swing.JOptionPane;

/* 반지름을 입력 받아서
   원의 넓이와 둘레를 계산하고
   출력하는 프로그램을 작성하세요.
   단, 입력, 넓이계산 둘레계산, 출력
 */
public class Ex01 {

	int ban = 0;
	double area_Res = 0;
	double around_Res = 0;
	public Ex01() {
		setNum();
		area(ban);
		around(ban);
		toPrint();
	}

	public void setNum() {
		ban = Integer.parseInt(JOptionPane.showInputDialog("반지름을 입력하세요"));
	}

	public void area(double a) {
		
		area_Res = (a * a) * 3.14;
	}

	public void around(int a) {
         //넓이공식
		around_Res = 2*3.14*a;
	}
	public void toPrint() {
		JOptionPane.showMessageDialog(null, "입력하신 원의 반지름"+ban+
				" 의 넓이값은 :" + area_Res + "이며 둘레 는 :"+around_Res +"입니다.");
		System.out.println( );
	}

	public static void main(String[] args) {
		new Ex01();

	}

}

package day02;

/* 		금액 74232원을 5만원원, 만원원, 오천원원, 천원, 오백원,백원,십원
 *		의 단위만 계산하기로 한다.
 */
public class Ex03 {
	public static void main(String[] args) {
		int money = 74232;
		int tmp = money;
		// 오만원권
		int oman = tmp / 50000;
		// 오만원권 빼고 남은금액
		tmp %= 50000;

		// 만원권
		int man = tmp / 10000;
		// 만원권 빼고 남은금액
		tmp %= 10000;

		// 오천원
		int ochun = tmp / 5000;
		tmp %= 5000;

		// 천원권
		int chun = tmp / 1000;
		tmp %= 1000;

		// 오백원
		int obeak = tmp / 500;
		tmp %= 500;
		
		//백원
		int beak = tmp / 100;
		tmp %= 100;
		
		//십원
		int sip = tmp / 10;
		tmp %= 10;
		
		System.out.printf("금액 %7d 원은, \n\t 오만원권 %2d장, \n\t만원권 %2d장, \n\t오천원권 %2d장,\n\t천원권 %2d장, \n\t오백원권 %2d개, \n\t백원권 %2d개, \n\t십원권 %2d개 \n를 지불해야 합니다.",
							money,oman,man,ochun,chun,obeak,beak,sip);


	}
}

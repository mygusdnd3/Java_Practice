package day02;

public class Ex_test_03 {

	public static void main(String[] args) {

// 		금액 74232원을 5만원원, 만원원, 오천원원, 천원, 오백원,백원,십원
//		 의 단위만 계산하기로 한다.

		ChangeMoney c = new ChangeMoney();
		c.OmanWon();
		c.manWon();
		c.o_chanWon();
		c.chanWon();
		c.o_beekWon();
		c.beekWon();
		c.shipWon();

	}

}

class Money {
	int money = 74232;
	int temp;

}

class ChangeMoney {
	void OmanWon() {
		Money m = new Money();
		int o_manWon = 50000;
		m.temp = m.money / o_manWon;
		m.money = m.money % o_manWon;
		System.out.println(o_manWon + "원 " + m.temp + "장 " + "남은금액 : " + m.money +"원");

	}

	void manWon() {
		Money m = new Money();
		int manWon = 10000;
		m.temp = m.money / manWon;
		m.money = m.money % manWon;
		System.out.println(manWon + "원 " + m.temp + "장 " + "남은금액 : " + m.money+"원");

	}

	void o_chanWon() {
		Money m = new Money();
		int o_chanWon = 5000;
		m.temp = m.money / o_chanWon;
		m.money = m.money % o_chanWon;
		System.out.println(o_chanWon + "원 " + m.temp + "장 " + "남은금액 : " + m.money+"원");
	}

	void chanWon() {
		Money m = new Money();
		int chanWon = 1000;
		m.temp = m.money / chanWon;
		m.money = m.money % chanWon;
		System.out.println(chanWon + "원 " + m.temp + "장 " + "남은금액 : " + m.money+"원");
	}

	void o_beekWon() {
		Money m = new Money();
		int o_beekWon = 500;
		m.temp = m.money / o_beekWon;
		m.money = m.money % o_beekWon;
		System.out.println(o_beekWon + "원 " + m.temp + "개 " + "남은금액 : " + m.money+"원");
	}

	void beekWon() {
		Money m = new Money();
		int beekWon = 100;
		m.temp = m.money / beekWon;
		m.money = m.money % beekWon;
		System.out.println(beekWon + "원 " + m.temp + "개 " + "남은금액 : " + m.money+"원");
	}

	void shipWon() {
		Money m = new Money();
		int shipWon = 10;
		m.temp = m.money / shipWon;
		m.money = m.money % shipWon;
		System.out.println(shipWon + "원 " + m.temp + "개 " + "남은금액 : " + m.money+"원");
	}
}

/*
 * int tmp = 74232; int moneyName1 = 50000; int moneyName2 = 10000; int
 * moneyName3 = 5000; int moneyName4 = 1000; int moneyName5 = 500; int
 * moneyName6 = 100; int moneyName7 = 10;
 * 
 * int oman = tmp / moneyName1; tmp %= moneyName1; System.out.println(moneyName1
 * + " 원원 :" + oman + "장  " + "남은돈 :" + tmp);
 * 
 * int man = tmp / moneyName2; tmp %= moneyName2; System.out.println(moneyName2
 * + " 원원 :" + man + "장  " + "남은돈 :" + tmp);
 * 
 * int ocw = tmp / moneyName3; tmp %= moneyName3; System.out.println(moneyName3
 * + " 원원 :" + ocw + "장  " + "남은돈 :" + tmp);
 * 
 * int cw = tmp / moneyName4; tmp %= moneyName4; System.out.println(moneyName4 +
 * " 원원 :" + cw + "장  " + "남은돈 :" + tmp);
 * 
 * int obw = tmp / moneyName5; tmp %= moneyName5; System.out.println(moneyName5
 * + " 원원 :" + obw + "장  " + "남은돈 :" + tmp);
 * 
 * int bw = tmp / moneyName6; tmp %= moneyName6; System.out.println(moneyName6 +
 * " 원원 :" + bw + "장  " + "남은돈 :" + tmp);
 * 
 * int sw = tmp / moneyName7; tmp %= moneyName7; System.out.println(moneyName7 +
 * " 원원 :" + sw + "장  " + "남은돈 :" + tmp);
 */

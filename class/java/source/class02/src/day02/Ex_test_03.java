package day02;

public class Ex_test_03 {

	public static void main(String[] args) {

		int money = 74232;
// 		5만원권, 만원권, 오천원권, 천원, 오백원,백원,십원
//		 의 단위만 계산하기로 한다.
		int tmp=74232;
		int moneyName1 = 50000;
		int moneyName2 = 10000;
		int moneyName3 = 5000;
		int moneyName4 = 1000;
		int moneyName5 = 500;
		int moneyName6 = 100;
		int moneyName7 = 10;
		
		int oman = tmp / moneyName1;
		tmp %= moneyName1;
		System.out.println(moneyName1+" 원권 :"+oman+"장  "+"남은돈 :"+ tmp);
		
		int man = tmp / moneyName2;
		tmp %= moneyName2;
		System.out.println(moneyName2+" 원권 :"+man+"장  "+"남은돈 :"+ tmp);
		
		int ocw = tmp / moneyName3;
		tmp %= moneyName3;
		System.out.println(moneyName3+" 원권 :"+ocw+"장  "+"남은돈 :"+ tmp);
		
		int cw = tmp / moneyName4;
		tmp %= moneyName4;
		System.out.println(moneyName4+" 원권 :"+cw+"장  "+"남은돈 :"+ tmp);
		
		int obw = tmp / moneyName5;
		tmp %= moneyName5;
		System.out.println(moneyName5+" 원권 :"+obw+"장  "+"남은돈 :"+ tmp);


		int bw = tmp / moneyName6;
		tmp %= moneyName6;
		System.out.println(moneyName6+" 원권 :"+bw+"장  "+"남은돈 :"+ tmp);
		

		int sw = tmp / moneyName7;
		tmp %= moneyName7;
		System.out.println(moneyName7+" 원권 :"+sw+"장  "+"남은돈 :"+ tmp);
		
		
		
	}

}

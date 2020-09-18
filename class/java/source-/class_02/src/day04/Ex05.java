package day04;

/*
 * 조건문 문제
 * 201~ 500 세 까지의 세자리 숫자를 랜덤하게 발생 시켜서
 * 그 수가 300보다 크면 "300보다 큰수"
 * 작으면 "300보다 작은수 " 출력되게 하시오
 */
public class Ex05 { // ( Math.random() * ( 최대값 - 최소값 ) ) + 최소값
	public static void main(String[] args) {

		// 201~500 랜덤 숫자 발생
		int randNum1 = (int) (Math.random() * (500 - 201)) + 201;
		// int randNum2 = (int)(Math.random()*(500-201))+201;
		// 크고 작음 결정
		String str = "";

		if (randNum1 >= 300) {
			str = " 큰수";
		} else if (randNum1 < 300) {
			str = " 작은수";
		} else {
			System.out.println("잘못된 입력값입니다.");
		}

		System.out.println("입력값 " + randNum1 + "은 300보다" + str + " 입니다.");

	}

}

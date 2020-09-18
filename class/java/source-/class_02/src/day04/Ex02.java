package day04;

/*
 * 랜덤하게 다섯자리 숫자를 만들고
 * 각 자리의숫자의 합을 구해서 출력해주는 프로그램을 작성하세요
 
 * 12345 -> 1+2+3+4+5
 */
public class Ex02 {
	public static void main(String[] args) {
		int rand = (int)(Math.random()*(99999-10000+1)+1);
		//int rand = 12345;
		
		System.out.printf("랜덤 숫자 :", rand);
		
		
		
		int tmp = rand % 10;
		System.out.println("1번째 자리 : "+tmp);
		int rand1 = rand / 10;
				
		int tmp2 = rand1 % 10;
		System.out.println("2번째 자리 : "+tmp2);
		int rand2 = rand1 / 10;
			
		int tmp3 = rand2 % 10;
		System.out.println("3번째 자리 : "+tmp3);
		int rand3 = rand2 / 10;
			
		int tmp4 = rand3 % 10;
		System.out.println("4번째 자리 : "+tmp4);
		int rand4 = rand3 / 10;
		
		int tmp5 = rand4 % 10;
		System.out.println("5번째 자리 : "+tmp4);
		int rand5 = rand4 / 10;
	
		int sum = tmp+tmp2+tmp3+tmp4+tmp5;
		System.out.printf("다섯자리 숫자의 합은 %d",sum);

		
	}
}

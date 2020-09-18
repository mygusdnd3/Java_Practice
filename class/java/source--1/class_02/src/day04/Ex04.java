package day04;
/*두 수를 랜덤하게 발생시켜 각각 변수에담고
 첫번째 수가 두번째 수보다 크면 양수 (같은경우에도 양수로 처리)
 첫번째 수가 두번째 수보다 작으면 음수
*/
public class Ex04 {
	public static void main(String[] args) {
		
		int randNum1 = (int)(Math.random() * 99-10+1)+1;
		int randNum2 = (int)(Math.random() * 99-10+1)+1;
		System.out.println(randNum1);
		System.out.println(randNum2);
		if (randNum1>=randNum2) {
			System.out.println("첫번째 수가 두번째 수보다 큰 양수입니다.");
		}else if(randNum1<randNum2) {
			System.out.println("첫번째 수가 두번째 수보다 큰 양수입니다.");
		}
		
	}
}

package day05;

/*
 * 문제 5]
 * 		주사위를 2개를 던질 경우 
 * 		두 눈의 합이 6이 되는 경우를 출력하세요.
 */
public class Ex05 {
	public static void main(String[] args) {
/*
		int a  = (int)(Math.random()*6);
		int a2  = (int)(Math.random()*6);
		int sum = 0;
		int cnt = 0;
		for(int i=0 ;i <10 ;i ++) {
			for(int j = 0; j < 10; j++ ) {
				//System.out.println(i+j);
				sum = i +j;
				if(sum == 6) {
					System.out.println(i+"와"+j+"의 값은 "+ sum);
					++cnt;
					break;
					System.out.println("총 " +cnt+ "회의 경우의 수가 발생한다.");*/
		// 첫번째 주사위 눈의 경우 반복문
		
		repeat:
		for(int i = 1; i<=6; i++) {
			//두번째 주사위의 경우
			for(int j = 1; j<=6; j++) {
				if(i+j == 6) {
					System.out.println("첫번째 주사위 눈 :"+i+",두번째 주사위 눈:"+j);
					continue repeat;
				}
			}
		}
		
		
	}

}

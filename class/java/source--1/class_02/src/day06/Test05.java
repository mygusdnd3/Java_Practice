package day06;
/*
 *  예제 ]
 *  	두 사람이 등산을 한다.
 *  	한 사람은 산 아래에서 위로 초당 0.54m의 속도로 올라가고
 *  	한 사람은 산 정상에서 아래로 초당 1.07m 의 속도로 내려간다/
 *  	산의 높이가 7564m 라고 가정하면
 *  	두 사람이 만나는 시점은 몇분 몇초 후 인지 계산하세요
 */
public class Test05 {

	public static void main(String[] args) {
		int result = 0;
		for(int i = 0;;i++) {
			// a의 i 초 후 위치 
			double no1 =0.54 *i;
			// b의 i 초 후 위치
			double no2 = 7564 - (1.07*i);
			
			if(no1 >=no2) {
				result = i;
				break;
			}
		}
		System.out.println("두 사람이 만나는 시간은"+(result /60)+"분"+(result%60)+"초 후 입니다");
	}
}

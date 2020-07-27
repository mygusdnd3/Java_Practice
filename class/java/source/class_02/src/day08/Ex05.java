package day08;

/*
 *  문제 5]
 *  	int[ no1 = {10,20,30,40,5};
 *  	no1 을 깊은 복사하여 no2를 만드세요
 *  
 */
public class Ex05 {
	public static void main(String[] args	) {
		
		int[] no1 = {10,20,30,40,5};
		int[] no2 = new int[no1.length];
		System.arraycopy(no1, 0, no2, 0, no2.length);
		
		no1[2] = 50;
		System.out.println("no1의 3번째 : "+no1[2] +" no2의 3번째 :"+ no2[2]);
	}
}

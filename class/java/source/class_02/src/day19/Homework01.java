package day19;


/*
 	과제 1 ]
 		nextInt()
 		NextINt(int bound) 	차이점을 조사해서 예제를 만들어 볼것.
 		
 		
 	과제 2	]
 		특정 범위의 난수를 발생하는 방법에 대하여 조사해서
 		이것을 이용한 프로그램을 작성하세요
 	
 */

import java.util.*;

public class Homework01 {

	public Homework01() {
		Random rdm = new Random();
		rdm.nextInt();
		rdm.nextInt(11);
		for (int i = 0; i < 100; i++) {
			System.out.println("nextint : "+rdm.nextInt()); // +- 가 무작위로 발생한다
			System.out.println("bounce  : "+rdm.nextInt(50)); //지정된 값이 나온다
			
		}
	}
//	Math.random() 으로 랜덤한 수 만들기
//	
//	(int) (Math.random() * (큰수 - 작은수 + 1) + 작은수)

	public static void main(String[] args) {
		new Homework01();
	}

}

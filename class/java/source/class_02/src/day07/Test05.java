package day07;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		/*
		 *  'a' ~ 'j' 문자 10개를 랜덤하게 발생시켜서
		 *  배열에 저장하세요.
		 *  단, 중복된 문자는 허용하지 않는 것으로 한다.
		 */
		
		// 배열을 만든다
		
		char[] chArr = new char[10];
		
		loop:
		for(int i = 0; i< chArr.length; i++) {
			char ch = (char)(Math.random() * ('j' - 'a' +1)+'a');
				// 이전 인덱스에 들어있는 데이터까지 반복해서 검사한다.
			for(int j =0; j<=i; j++) {
				if(chArr[j] == ch) {
					--i;
					continue loop;
				}
				chArr[i] = ch;
			}
			
		}
		
		System.out.println(Arrays.toString(chArr));
			
			//오름 차순으로 정렬하기
		for(int i =0; i <chArr.length -1; i++) {
			for(int j = i+1; j< chArr.length; j++) {
				char ch01 = chArr[i];
				char ch02 = chArr[j];
				char tmp = ' ';
				
				if(ch01 > ch02) {
					// 다음 인덱스의 데이터가 작은 경우이므로
					// 데이터를 교체 시켜준다.
					// 대신, 바로 교체하게 되면 큰 데이터는 사라지므로
					// 그 전에 임시 변수에 저장해 두고 교체한다.
					tmp = ch01;
					chArr[i] = ch02;
					chArr[j] = tmp;
				}
			}
			
		}
		System.out.println(Arrays.toString(chArr));
	}

}

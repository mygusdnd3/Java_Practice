package day06;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {

		//배열을 만든다.
		
		char[] chArr = new char[10];
		
		loop:
		for(int i = 0; i< chArr.length; i++) {
			char ch = (char)(Math.random() * ('j' - 'a' +1)+'a' );
			//이전 인덱스에 들어있는 데이터 까지 반복해서 검사한다.
			
			for(int j =0; j<i; j++) {
				if(chArr[j] == ch) {
					i--;
					continue loop;
					}
				
				}
			chArr[i] = ch;
		}
		
		for(int i = 0; i< chArr.length -1; i++) {
			for(int j = i+1; j< chArr.length; j++) {
				char ch01 = chArr[i];
				char ch02 = chArr[j];
				char tmp =' ';
				
				if(ch01>ch02) {
					tmp = ch01;
					chArr[i] = ch02;
					chArr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(chArr));
		
	}
}

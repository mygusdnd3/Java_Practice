package day08;

import java.util.Arrays;

/*
 * 문제 6]
 * 	int[] no1 = {10,20,30,40,50};
 * 
 * no1의 데이터를 복사해서
 * no2를 만드는데
 * {40,50,,10,20} 형태로 만드세요
 */
public class Ex06 {
	public static void main(String[] args) {
		int[] no1 = {10,20,30,40,50};
		int[] no2 = new int[no1.length];
		System.arraycopy(no1, 3, no2, 0, 2);
		System.arraycopy(no1, 0, no2, 3, 2);
		
		for(int i = 0 ; i<no2.length;i++) {
			System.out.print(no2[i] +" | ");
		}
		for(int arr : no2) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
//System.arraycopy(#1, #2, #3, #4,#5);
//
//	#1 - 원본 데이터의 주소
//	#2 - 원본 데이터에서 복사를 시작할 위치
//	#3 - 복사 받을 배열의 주소
//	#4 - 복사 받을 주소의 시작 위치
//	#5 - 복사 받을 데이터의 갯수
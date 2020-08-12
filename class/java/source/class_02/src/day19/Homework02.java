package day19;

import java.util.Arrays;

/*
  	과제 3]
  		Arrays 클래스 함수를 5개이상 조사한 수,
  		그 함수를 사용하는 예제 프로그램을 작성하세요
 
 */
public class Homework02 {

	public Homework02() {
	}

	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1,0};
		int[] b = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(Arrays.binarySearch(a, i)+" | ");
		}
		System.out.println();
		
		int[] c = Arrays.copyOfRange(a, 5, a.length);
		System.out.println(Arrays.toString(c));
		
		int[] d = new int[3];
		Arrays.fill(d, 9);
		System.out.println(Arrays.toString(d));
		
		Arrays.asList(a);
		
		
	
		
		
	}

}

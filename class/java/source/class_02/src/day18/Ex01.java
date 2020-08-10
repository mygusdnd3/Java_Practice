package day18;

import javax.swing.JOptionPane;

/*
 	문제 1 ] 
 		String[] str = {"123,"456","789","23/2"...};
 		이런 배열이 있는 경우
 		이것의 합과 평균을 구하는 프로그램을 작성하세요.
 		
 		단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
 		1. 배열의 인덱스를 벋어나는 경우
 		2. 숫자로 변환이 불가능한 경우
 		3. 평균을 계산하는데 0으로 나누는 경우..? ArithmeticEx
 		
 */
public class Ex01 {

	public Ex01() {
	}

	public static void main(String[] args) {
		String[] str = {"123","456","848","gh54"};
		int[] arr = new int[str.length];
		for(int i =0 ; i < str.length+3; i++) {
			try {
				arr[i] = Integer.parseInt(str[i]);
				
			} catch(NumberFormatException e) {
				System.out.println("문자가 포함되어 변환할 수 없습니다.");
				//break;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열이 인덱스를 벗어났습니다.");
				break;
			}
			
		}//for문 끝
	}
}
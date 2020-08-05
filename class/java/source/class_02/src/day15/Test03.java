package day15;

import java.util.*;
public class Test03 {
	String[] chArr;	//문자열 배열을 기억할 준비를 하고
	public Test03() {
		
		String str = "5,50,80,75,90";
		//배열만들고
		chArr = getArr(str);
		//배열 출력하고
		toPrint();
	}

	public static void main(String[] args) {
		new Test03();
	}
		//문자열 문자열배열로 분리하기..
		// 이 함수의 입력 문자열은 25,50,80,75,90 의 형태로 점수를 모두 입력하면
		// 문자열 배열로 분리해서 저장는 기능을 가지는 함수.
	public String[] getArr(String str) {
		//길이부터 정하고
		int len = 1;
		for (int i = 0; i < str.length();i++) {
			if(str.charAt(i) == ',') {
				len = len +1; // 문자열을 숫자갯수만큼만 만들기위해
								/// len으로 콤마갯수를 확인해서 길이로사용
			}
		}
		
		String[] arr = new String[len];
		StringTokenizer token = new StringTokenizer(str, ",");
		for(int i = 0; token.hasMoreElements() ; i++) {
			arr[i] = (String)token.nextElement(); //토큰에있는걸 꺼내서 '오브젝트형태'로 반환
			//arr[i] = token.nextToken();// 반환값이 문자열 형변환해볼라고 위에껄로
		}
		
		
		return arr;
		
		
	}
	public void toPrint() {
		for(String str : chArr	) {
			System.out.print(str+",");
		}
	}
}

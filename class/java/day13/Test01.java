package day13;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test01 {

	public static void main(String[] args) {
		String str = "10,20,25,40,50";
		// str을 ,를 기준으로 배열로 만드세요
		System.out.println(str);
		int len = 0;
		
		for (int i =0 ; i < str.length(); i++) {
			if(str.charAt(i) ==',') {
				len += 1;
			}
		}
		String[] arr = new String[len+1];
		
		StringTokenizer token = new StringTokenizer(str, ",");
		
		//while(token.hasMoreTokens()) { //더이상 꺼낼 토큰이 있니 있으면 true, 없으면 false
		for(int i = 0 ; token.hasMoreTokens();i++) {
			arr[i] = token.nextToken();
	
			
		}
	
			System.out.println(Arrays.toString(arr));
	}

}

package day19;

import java.util.*;
public class Test04 {

	public Test04() {
		String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=422&aid=0000442385";
		String[] keys = new String[5];
		String[] vals = new String[5];
		// ?이후의 데이터를 잘라내서
		// mode=LSD의 경우에는 
		//mode는 키값배열레
		// LSD는 벨류 배열에 채워주세요
		
		/*
		 	문자열 조작 함수
		 	
		 		substring(시작위치, 종료위치)
		 		charAt(인덱스)
		 		indexOf(문자 또는 문자열)
		 		
		 */
		
//		int idx = str.indexOf('=');
//		String a=  str.substring(1,idx);
//		int idx2 = str.indexOf('&');
//		String b =   str.substring(idx+1,idx2);
//		str = str.substring(idx2+1);
//		System.out.printf(a);
//		System.out.println(b);
		int tmp = url.indexOf('?');
		
		int idx = 0;
		int idx2 = 0;
		String str = url.substring(tmp+1);
		for(int i = 0; i<keys.length;i++) {
			
			idx = str.indexOf('=');
			keys[i] = str.substring(0,idx);
			System.out.println(i+"번째 keys :"+keys[i]);
			try {
			idx2 = str.indexOf('&');
			vals[i] = str.substring(idx+1,idx2);
			} catch (Exception e) {
				vals[i] = str.substring(idx+1);
			}
			//vals[i] = str.substring(idx+1,idx2);
			System.out.println(i+"번째 vals :"+vals[i]);
			str = str.substring(idx2+1);
			System.out.println(str);
			
		}
		
		StringTokenizer token1 = new StringTokenizer(url, "?");
		String data = "";
		int cnt = token1.countTokens();
		for(int i = 0; i< cnt; i++) {
			if(i == 0) continue;
			data = token1.nextToken();
		}
		
//		
//		token1.nextToken();
//		
//		StringTokenizer token2 = new StringTokenizer(token1.nextToken(), "&");
	}

	public static void main(String[] args) {
		new Test04();
	}

}

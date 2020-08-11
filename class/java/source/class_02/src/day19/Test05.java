package day19;

import java.util.StringTokenizer;

public class Test05 {

	public Test05() {
		String str = "[10,9,8,7,6]";
		String str2 = "[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]";
		String str3 = "010-4522+5456/5188";
		str2 = str2.substring(str2.indexOf("[[")+2,str2.indexOf("]]"));
		System.out.println(str2);
		StringTokenizer token1 = new StringTokenizer(str2, "[],");
		str2 = str2.replace("],[", " | ");
		System.out.println(str2);
		
		
//		String data="";
//		for (int i = 0; token1.hasMoreTokens(); i++) {
//			data +=token1.nextToken();
//		}
//		System.out.println(data);
//		
		
		
		
		//정수 배열에 담으세요
		int[][] arr2 = new int[5][5];
	}	

	public static void main(String[] args) {
		new Test05();
	}

}

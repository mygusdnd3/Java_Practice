package day21;

import java.security.cert.CollectionCertStoreParameters;
/*
 	가로와 세로가 랜덤하게 만들어진 사각형을 10개를 만들어서
 	ArrayList에 담고
 	내용을 출력하고
 	
 	면적을 기준으로 정렬하고
 	출력하고
 	가로를 기준으로 정렬하고
 	출력하고
 	세로를 기준으로 정렬하고 
 	출력하고
 	넹
 */
import java.util.*;
public class Ex02 {

	public Ex02() {
	 
		ArrayList list = new ArrayList();
		
		for(int i = 0 ; i < 10; i++) {
			//Sagak sagak = setSagak();
			list.add( setSagak());
			
		}
		System.out.println("출력");
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("Area_Sort");
		Collections.sort(list);
		
		for(Object o : list) {
			System.out.println(o);
		}
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Sagak n = (Sagak)o1;		
				Sagak n2 = (Sagak)o1;		
				int garo = n.getGaro();
				return n.getGaro() - n2.getGaro()>0?1:-1;
			}
			
		});
		
		System.out.println("Garo_Sort");
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Sagak n = (Sagak)o1;		
				Sagak n2 = (Sagak)o1;		
				int sero = n.getSero();
				return n.getSero() - n2.getSero()>0?1:-1;
			}
			
		});
		System.out.println("Sero_Sort");
		Collections.sort(list);
		
		for(Object o : list) {
			System.out.println(o);
		}
	} 
	
	public Sagak setSagak() {
		Sagak sagak = new Sagak();
		int garo = (int)(Math.random()*20-1+1)+10;
		int sero = (int)(Math.random()*20-1+1)+10;
		sagak.setGaro(garo);
		sagak.setSero(sero);
		sagak.setArea();
		return sagak;
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}

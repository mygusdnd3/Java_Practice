package day23.source;

import java.util.*;
public class IdolList {
	private ArrayList<Integer> noList;
	private ArrayList<String> names;
	
	public IdolList() {
		noList = new ArrayList<Integer>();
		names = new ArrayList<String>();
	}

	public ArrayList<Integer> setNoList() {
		for(int i = 0; i < 5; i++) {
			noList.add(1001+i);
		}
		
		return noList;
	}

	public void setNoList(ArrayList<Integer> noList) {
		this.noList = noList;
	}

	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		
		this.names = names;
	}
	public ArrayList<String> setNames() {
		names.add("우지윤");
		names.add("안지영");
		names.add("린다G");
		names.add("아이린");
		names.add("조이");
		return names;
	}
	public int[] setScore() {
		int[] score = new int[4];
		for(int i = 0; i < 4; i++) {
			score[i] = (int)(Math.random()*41+60);
		}
		return score;
	}
	
	public int[] setScore(int cnt) {
		int[]score = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			score[i] = (int)(Math.random()*41+60);
		}
		return score;
	}
	
}

package day21;

import java.util.*;
public class Sagak implements Comparable {
	private int garo, sero, area;

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	public int getArea() {
		return area;
	}

	public void setArea() {
		this.area = garo * sero;
	}
	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Nemo : garo = " + garo + ", sero = " + sero + ", area = " + area ;
	}

	@Override
	public int compareTo(Object o) { //클래스를 다 받을수있는 Object로 정의되어있다.
		Sagak n = (Sagak)o;		
		// 이제 필요한 데이터가 준비 됬으니
		// 비교 기준을 정해준다.
		// 우리의 경우 면적(area)를 기준으로 하기로  하자 .
		int area1 = n.getArea();
		
		int result = area - area1;
		return result;
	}
	

}

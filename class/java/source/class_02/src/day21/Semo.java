package day21;
/*
 	삼각형의 넓이는 : " + hight * bottom * 0.5);
		사각형의 넓이는 : " + hight * bottom);
		원 면적 area = rad * rad * PI
		원 둘레 arround = 2 * rad * PI;
 */
import java.util.*;
public class Semo implements Comparable {
	int hight,bottom;
	double area;
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getBottom() {
		return bottom;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = hight + bottom*0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Semo : hight = " + hight + ", bottom = " + bottom + ", area = " + area;
	}
	@Override
	public int compareTo(Object o) {
		Semo semo = (Semo)o;
		int area = (int) semo.getArea();
		return this.area-area >0? 1:-1;
	}
	/*
	 * 	@Override
	public int compareTo(Object o) { //클래스를 다 받을수있는 Object로 정의되어있다.
		Nemo n = (Nemo)o;		
		// 이제 필요한 데이터가 준비 됬으니
		// 비교 기준을 정해준다.
		// 우리의 경우 면적(area)를 기준으로 하기로  하자 .
		int area1 = n.getArea();
		
		int result = area - area1;
		return -result;
	 */
}

package day22.source;

import java.text.DecimalFormat;

public class Circle implements Comparable{
	private final int CODE = 1000;
	private int rad;
	private double arround, area;
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public String getArround(int code) {
		DecimalFormat form = new DecimalFormat("########.00");
		String val = form.format(arround);
		return val;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public void setArround() {
		this.arround = 2 * rad * Math.PI;
	}
	public double getArea() {
		return area;
	}
	// 넓이 문자열로 반환되도록 오버로딩
	public String getArea(int code) {
		DecimalFormat form = new DecimalFormat("################.00");
		String val = form.format(area);
		return val;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		this.area = rad * rad * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle [rad=" + rad + ", arround=" + getArround(CODE) + ", area=" + getArea(1000);//아무정수코드
	}
	@Override
	public int compareTo(Object o) {
		Circle c1 = (Circle)o;
		int area = (int) c1.getArea();
		return (this.getArea() - area)>0?1:-1;
	}

}

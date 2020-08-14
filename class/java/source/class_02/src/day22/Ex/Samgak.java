package day22.Ex;

public class Samgak {
	int bottom, hight;
	double area;
	//삼각형의 넓이는 : " + hight * bottom * 0.5);
	public Samgak() {}
	public Samgak(int bottom, int hight) {
		this.bottom = bottom;
		this.hight = hight;
	}
	public void setArea() {
		this.area = hight * bottom * 0.5;
	}
	public int getBottom() {
		return bottom;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Samgak : bottom=" + bottom + ", hight=" + hight + ", area=" + area ;
	}
	public boolean equals(Object o) {
		
		Samgak s = (Samgak)o;
		return this.bottom == s.bottom || this.hight == s.hight;
		
	}
	
	public int hashCode() {	//hash코드를 동일하게만들어서 equals 기준으로 배포가 되도록.
		return 1;
		
	}
}

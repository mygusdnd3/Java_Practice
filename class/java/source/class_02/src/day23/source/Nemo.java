package day23.source;

public class Nemo implements Figure {
	int garo,sero;
	double area;
	public int getGaro() {
		return garo;
	}
	public Nemo(int garo, int sero) {
		super();
		this.garo = garo;
		this.sero = sero;
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
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public double getArea() {
		return area;
	}
	
}

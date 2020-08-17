package day23.source;

public class Semo implements Figure {
	private int width, height;
	private double area;
	

	public Semo(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		setArea();
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public void setArea() {
		this.area = width*height/2.;
	}
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public double getArea() {
		return area;
	}


	public Semo() {
	}

}

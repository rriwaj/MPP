package week1.day5.prob3;

public class Rectangle implements Shape {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double computeArea() {
		return width * length;
	}
}

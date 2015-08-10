package week1.day5.prob3;

public class Triangle implements Shape {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double computeArea() {
		return 0.5 * base * height;
	}
}

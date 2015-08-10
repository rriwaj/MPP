package week1.day5.prob3;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return Math.PI * radius * radius;
	}
}

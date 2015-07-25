package week1.day3.prob2.b;

public class Cylinder {
	private double height = 1.0;
	private Circle circle;

	public Cylinder() {
		circle = new Circle();
	}

	public Cylinder(double radius) {
		circle = new Circle(radius);
	}

	public Cylinder(double radius, double height) {
		circle = new Circle(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return Math.PI * circle.getRadius() * circle.getRadius() * height;
	}
}

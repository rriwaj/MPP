package lesson7.labs.prob2;

public class Circle implements Polygon {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius;
	}
	@Override
	public double[] getSides() {
		System.out.println("Circle ");
		return new double[] { radius };
	}
}

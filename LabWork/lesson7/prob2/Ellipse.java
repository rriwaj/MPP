package labwo.lesson7.problems.prob2;

public class Ellipse implements ClosedCurve {

	private double a;
	private double E;

	Ellipse(double length, double E) {
		a = length;
		this.E = E;
	}

	@Override
	public double computePerimeter() {
		return 4 * a * E;
	}

}

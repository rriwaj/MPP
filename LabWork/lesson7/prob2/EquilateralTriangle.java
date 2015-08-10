package labwo.lesson7.problems.prob2;

public class EquilateralTriangle implements Polygon {

	private double side;

	EquilateralTriangle(double s) {
		side = s;
	}

	@Override
	public double[] getSides() {
		return new double[] { 3 * side };
	}
}

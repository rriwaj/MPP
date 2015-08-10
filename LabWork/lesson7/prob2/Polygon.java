package labwo.lesson7.problems.prob2;

public interface Polygon extends ClosedCurve {

	default double computePerimeter() {
		double sumOfSides = 0;

		for (double side : getSides()) {
			sumOfSides += side;
		}

		return sumOfSides;
	}

	double[] getSides();

}

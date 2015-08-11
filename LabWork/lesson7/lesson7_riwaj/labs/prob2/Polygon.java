package lesson7.labs.prob2;

public interface Polygon {
	double[] getSides();

	default double computePerimeter() {
		double[] sides = getSides();
		int perimeter = 0;
		for (double side : sides) {
			perimeter += side;
		}
		return perimeter;
	}
}
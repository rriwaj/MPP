package lesson7.labs.prob2;

public class Ellipse implements Polygon {
	double a;
	double E;

	public Ellipse(double a, double e) {
		super();
		this.a = a;
		E = e;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getE() {
		return E;
	}

	public void setE(double e) {
		E = e;
	}

	@Override
	public double computePerimeter() {
		// System.out.println("side=eclipse");
		return 4 * a * E;
	}

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return new double[] { a, E };
	}

}

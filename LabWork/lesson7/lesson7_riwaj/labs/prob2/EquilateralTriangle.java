package lesson7.labs.prob2;

public class EquilateralTriangle implements  Polygon{
double length;



public EquilateralTriangle(double side1) {
	super();
	this.length = side1;
}

public double getSide1() {
	return length;
}

public void setSide1(double side1) {
	this.length = side1;
}

@Override
public double[] getSides() {
	// TODO Auto-generated method stub
	return new double[] { length, length, length };
}
}

package week1.day5.prob3;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Rectangle(15, 20));
		shapes.add(new Triangle(12, 6));
		shapes.add(new Circle(9));

		double sum = 0;
		for (Shape shape : shapes) {
			sum += shape.computeArea();
		}

		System.out.printf("Sum of Areas = %.2f", sum);
	}
}

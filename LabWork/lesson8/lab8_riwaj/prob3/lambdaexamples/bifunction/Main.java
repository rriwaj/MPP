package lesson8.lab.prob3.lambdaexamples.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
	public static void main(String[] args) {
		BiFunction<Double, Double, List<Double>> b1 = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};
		List<Double> res = b1.apply(2.0, 3.0);
		System.out.println(res);
	}
}
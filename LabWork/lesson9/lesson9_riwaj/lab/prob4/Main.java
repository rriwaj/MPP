package lesson9.lab.prob4;

import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		printSquares(4);
	}

	public static void printSquares(int num) {
		IntStream is = IntStream.iterate(1, n -> n + 1)
				.filter(n -> isPerfectSquare(n)).limit(num);
		//System.out.println(is.boxed().collect(Collectors.toList()).toString());

		is.forEach(System.out::println);
	}

	public static boolean isPerfectSquare(int n) {
		boolean isPerectSquare = false;
		if (n == (int) Math.sqrt(n) * (int) Math.sqrt(n)) {
			isPerectSquare = true;
		}
		return isPerectSquare;
	}
}

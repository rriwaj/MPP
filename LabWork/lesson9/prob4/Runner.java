package labwo.lesson9.problems.prob4;

import java.util.stream.IntStream;

public class Runner {
	public static void printSquares(int num) {
		IntStream.iterate(1, n -> (int) Math.pow(Math.sqrt(n) + 1, 2))
				.limit(num).forEach(System.out::println);
	}

	public static void main(String[] args) {
		printSquares(6);
	}
}

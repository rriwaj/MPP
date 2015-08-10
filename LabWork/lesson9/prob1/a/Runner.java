package labwo.lesson9.problems.prob1.a;

import java.util.stream.IntStream;

public class Runner {
	public static void main(String[] args) {
		IntStream ones = IntStream.generate(() -> 1).distinct();

		/*
		 * the following "committed code" will use the stream for the first
		 * time, and then it will stop (closed), as the same stream is not
		 * reusable
		 */

		// ones.forEach(System.out::println);

		/*
		 * we may solve this by limiting the stream to 1, which will give the
		 * same output and ends the program.
		 */
		ones.limit(1).forEach(System.out::println);
	}
}

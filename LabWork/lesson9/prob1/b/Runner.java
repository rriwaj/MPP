package labwo.lesson9.problems.prob1.b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(stringStream.collect(Collectors.joining(", ")));
	}
}

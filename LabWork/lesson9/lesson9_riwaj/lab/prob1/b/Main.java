package lesson9.lab.prob1.b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Marry");
		System.out.println(stringStream.collect(Collectors.joining(",")));
	}
}

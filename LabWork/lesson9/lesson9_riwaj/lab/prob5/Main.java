package lesson9.lab.prob5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.limit(n).skip(m);
	}

	public static void main(String[] args) {
		Stream<String> s = Stream.of("a", "b", "c", "d","e");
		System.out.println(streamSection(s, 2, 4).collect(Collectors.toList())
				.toString());
	}

}

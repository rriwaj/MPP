package labwo.lesson7.problems.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays
				.asList("Hello there", "Goodbye", "Back soon", "Away",
						"On Vacation", "Everywhere you want to be");

		// print each element of the list in upper case format
		list.forEach(stringConsumer);

	}

	// implement a Consumer
	public static final Consumer<String> stringConsumer = (s) -> {
		System.out.println(s.toUpperCase());
	};

}
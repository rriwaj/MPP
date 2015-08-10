package labwo.lesson9.problems.prob8;

import java.util.List;
import java.util.stream.Collectors;

import labwo.lesson9.problems.prob7.b.TriFunction;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Integer, Character, Long> EMPLOYEES_COUNT = (
			list, minSal, lowChar) -> list.stream()
			.filter(e -> e.getSalary() > minSal)
			.filter(e -> e.getLastName().charAt(0) > lowChar).count();

	public static final TriFunction<List<Employee>, Integer, Character, List<String>> EMPLOYEES_FULL_NAME = (
			list, minSal, lowChar) -> list
			.stream()
			.filter(e -> e.getSalary() > minSal)
			.filter(e -> e.getFirstName().charAt(0) < lowChar)
			.map(e -> e.getFirstName().toUpperCase() + " "
					+ e.getLastName().toUpperCase())
			.collect(Collectors.toList());
}

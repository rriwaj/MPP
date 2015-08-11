package lesson9.lab.prob8;

import java.util.List;
import java.util.stream.Collectors;

import lesson9.lab.prob7b.TriFunction;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Character, Integer, Integer> COUNT_LIST = (
			list, ch, sal) -> (int) list
			.stream()
			.filter(e -> e.getFirstName().charAt(0) > ch && e.getSalary() > sal)
			.count();
	public static final TriFunction<List<Employee>, Character, Integer, List<String>> EMP_LIST = (
			list, ch, sal) -> list
			.stream()
			.filter(e -> e.getSalary() > sal && e.getFirstName().charAt(0) < ch)
			.sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
			.map(e -> e.getFirstName().toUpperCase() + " "
					+ e.getLastName().toUpperCase())
			.collect(Collectors.toList());
}
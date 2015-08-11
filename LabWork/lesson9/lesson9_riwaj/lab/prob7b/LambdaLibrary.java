package lesson9.lab.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public final static TriFunction<List<Employee>, Integer, String, List<String>> FILTER_NAME_SALARY = (
			list, sal, name) -> list.stream()
			.sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
			.filter(e -> e.getSalary() > sal)
			.filter(e -> !e.getFirstName().startsWith(name))
			.map(e -> e.getFirstName() + " " + e.getLastName())
			.collect(Collectors.toList());

}

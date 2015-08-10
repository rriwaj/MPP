package labwo.lesson9.problems.prob7.b;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import labwo.lesson9.problems.prob7.b.Employee;

public class LambdaLibrary {

	public static final quadFunction<List<Employee>, Integer, Character, Character, List<String>> EMPLOYEE_NAMES_BY_QUAD_FUNCTION = (
			list, minSal, lowChar, highChar) -> list
			.stream()
			.filter(e -> e.getSalary() > minSal)
			.filter(e -> e.getLastName().charAt(0) > lowChar
					&& e.getLastName().charAt(0) <= highChar)
			.sorted(Comparator.comparing((Employee e) -> e.getFirstName()))
			.map(e -> e.getFirstName() + " " + e.getLastName())
			.collect(Collectors.toList());

	public static final TriFunction<List<Employee>, Integer, Character, List<String>> EMPLOYEE_NAMES_BY_TRI_FUNCTION = (
			list, minSal, lowChar) -> list.stream()
			.filter(e -> e.getSalary() > minSal)
			.filter(e -> e.getLastName().charAt(0) > lowChar)
			.sorted(Comparator.comparing((Employee e) -> e.getFirstName()))
			.map(e -> e.getFirstName() + " " + e.getLastName())
			.collect(Collectors.toList());

}

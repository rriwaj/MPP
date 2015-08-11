package lesson9.lab.prob7a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Joe", "Davis", 120000), new Employee("John",
						"Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew",
						"Reardon", 80000), new Employee("Joe", "Cummings",
						760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice",
						"Richards", 101000), new Employee("Monald", "Trump",
						110000));

		List<String> lst = list
				.stream()
				.sorted((e1, e2) -> e1.getFirstName().compareTo(
						e2.getFirstName())).filter(e -> e.getSalary() > 100000)
				.filter(e -> !e.getFirstName().startsWith("M"))
				.map(e -> e.getFirstName() + " " + e.getLastName())
				.collect(Collectors.toList());
		System.out.println(lst);
	}
}
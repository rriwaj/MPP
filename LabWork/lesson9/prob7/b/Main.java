package labwo.lesson9.problems.prob7.b;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Joe", "Davis", 120000), new Employee("John",
						"Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew",
						"Reardon", 80000), new Employee("Joe", "Cummings",
						760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice",
						"Richards", 101000), new Employee("Donald", "Trump",
						100000));

		List<String> employeeNames = LambdaLibrary.EMPLOYEE_NAMES_BY_QUAD_FUNCTION
				.apply(list, 100000, 'M', 'Z');
		System.out.println(employeeNames);

		List<String> employeeNames2 = LambdaLibrary.EMPLOYEE_NAMES_BY_TRI_FUNCTION
				.apply(list, 100000, 'M');
		System.out.println(employeeNames2);

	}

}

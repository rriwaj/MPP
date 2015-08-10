package labwo.lesson9.problems.prob8;

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

		// print the number of Employees in list whose salary > 100000 and whose
		// last name begins
		// with a letter that comes after the letter 'E'

		long numEmployees = LambdaLibrary.EMPLOYEES_COUNT.apply(list, 100000,
				'E');
		System.out.println(numEmployees);

		// print a list of sorted full names - all upper case -- of Employees
		// with
		// salary > 85000 and whose first name begins with a letter that comes
		// before the letter 'R'

		List<String> empFullNames = LambdaLibrary.EMPLOYEES_FULL_NAME.apply(
				list, 85000, 'R');
		System.out.println(empFullNames);

	}

}
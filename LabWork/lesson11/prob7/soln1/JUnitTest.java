package labwork.lesson11.problems.prob7.soln1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import labwork.lesson11.problems.prob7.Employee;
import labwork.lesson11.problems.prob7.Main;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void test() {
		List<Employee> employees = Arrays.asList(new Employee("Joe", "Davis",
				120000), new Employee("John", "Sims", 110000), new Employee(
				"Joe", "Stevens", 200000), new Employee("Andrew", "Reardon",
				80000), new Employee("Joe", "Cummings", 760000), new Employee(
				"Steven", "Walters", 135000), new Employee("Thomas", "Blake",
				111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));
		String employeeNames = Main.asString(employees);
		String employeeNames2 = "Joe Stevens, John Sims, Steven Walters";
		assertEquals(employeeNames, employeeNames2);
		// Main.asString(employees);
	}
}

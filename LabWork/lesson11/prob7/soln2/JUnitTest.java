package labwork.lesson11.problems.prob7.soln2;

import static org.junit.Assert.*;
import labwork.lesson11.problems.prob7.Employee;
import labwork.lesson11.problems.prob7.Main;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void test() {
		Employee employee = new Employee("Steven", "Walters", 135000);
		assert Main.salaryGreaterThan100000(employee);
		assert Main.lastNameAfterM(employee);
		String employeeName = Main.fullName(employee);
		assertEquals("Steven Walters", employeeName);

	}

}

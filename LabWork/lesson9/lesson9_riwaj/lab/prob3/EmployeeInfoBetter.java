package lesson9.lab.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class EmployeeInfoBetter {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> e.getSalary();
	Function<Map<SortMethod, List<Employee>>, Stream<EmployeeInfoBetter.SortMethod>> empStrm = lst -> lst
			.keySet().stream();
	HashMap<SortMethod, Comparator<Employee>> map = new HashMap<EmployeeInfoBetter.SortMethod, Comparator<Employee>>();

	public EmployeeInfoBetter() {
		map.put(SortMethod.BYNAME,
				Comparator.comparing(byName).thenComparing(bySalary));
		map.put(SortMethod.BYSALARY, Comparator.comparing(bySalary)
				.thenComparing(byName));
	}

	// Other
	public void sort(List<Employee> emps, final SortMethod method) {
		Collections.sort(emps, map.get(method));
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));

		System.out.println("Without Sorting");
		System.out.println(emps);
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		System.out.println("After Sorting");
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYNAME);
		System.out.println(emps);
	}
}

package labwo.lesson8.problems.prob6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class Examples {

	// A
	Function<Employee, String> getName0 = new Function<Employee, String>() {

		@Override
		public String apply(Employee t) {
			return t.getName();
		}

	};
	Function<Employee, String> getName1 = (Employee e) -> e.getName();
	Function<Employee, String> getName2 = Employee::getName; // Class::instanceMethod

	// B
	BiConsumer<Employee, String> setName1 = (Employee e, String s) -> e
			.setName(s);
	BiConsumer<Employee, String> setName2 = Employee::setName; // Class::instanceMethod

	// C
	ToIntBiFunction<String, String> compareTo1 = (String s1, String s2) -> s1
			.compareTo(s2);
	ToIntBiFunction<String, String> compareTo2 = String::compareTo; // Class::instanceMethod
	// another solution
	Comparator<String> compareTo3 = (String s1, String s2) -> s1.compareTo(s2);
	Comparator<String> compareTo4 = String::compareTo;
	// another solution
	BiFunction<String, String, Integer> compareTo5 = (String s1, String s2) -> s1
			.compareTo(s2);
	BiFunction<String, String, Integer> compareTo6 = String::compareTo;

	// D
	ToDoubleBiFunction<Integer, Integer> pow1 = (Integer a, Integer b) -> Math
			.pow(a, b);
	ToDoubleBiFunction<Integer, Integer> pow2 = Math::pow; // Class::staticMethod
	// also can be done by BiFunction @FunctionalInterface

	// E
	ToDoubleFunction<Apple> getWeight1 = (Apple a) -> a.getWeight();
	ToDoubleFunction<Apple> getWeight2 = Apple::getWeight; // Class::instanceMethod
	// also can be done by Function @FunctionalInterface

	// F
	ToIntFunction<String> parseInt1 = (String s) -> Integer.parseInt(s);
	ToIntFunction<String> parseInt2 = Integer::parseInt; // Class::staticMethod
	// also can be done by Function @FunctionalInterface

	// G
	EmployeeNameComparator comp = new EmployeeNameComparator();
	ToIntBiFunction<Employee, Employee> compare1 = (Employee e1, Employee e2) -> comp
			.compare(e1, e2);
	ToIntBiFunction<Employee, Employee> compare2 = comp::compare; // object::instanceMethod
	// another solution
	Comparator<Employee> compare3 = (Employee e1, Employee e2) -> comp.compare(
			e1, e2);
	Comparator<Employee> compare4 = comp::compare;
	// another solution
	BiFunction<Employee, Employee, Integer> compare5 = (Employee e1, Employee e2) -> comp
			.compare(e1, e2);
	BiFunction<Employee, Employee, Integer> compare6 = comp::compare;

	void evaluator() {
		Employee e1 = new Employee("Abdallah", 1000);
		Employee e2 = new Employee("Riwaj", 1000);
		System.out.println(getName1.apply(e1));
		System.out.println(getName2.apply(e2));

		setName1.accept(e1, "Mustafa");
		System.out.println(getName1.apply(e1));

		System.out.println(compareTo1.applyAsInt(getName1.apply(e1),
				getName2.apply(e2)));
		System.out.println(compareTo2.applyAsInt("Hello", "Hello"));

		System.out.println(pow1.applyAsDouble(2, 2));
		System.out.println(pow2.applyAsDouble(5, 4));

		Apple a1 = new Apple(0.15);
		Apple a2 = new Apple(0.25);
		System.out.println(getWeight1.applyAsDouble(a1));
		System.out.println(getWeight2.applyAsDouble(a2));

		System.out.println(parseInt1.applyAsInt("33"));
		System.out.println(parseInt2.applyAsInt("27"));

		System.out.println(compare1.applyAsInt(e1, e2));
		System.out.println(compare2.applyAsInt(e1, e2));

	}

	public static void main(String[] args) {
		Examples examples = new Examples();
		examples.evaluator();
	}

}

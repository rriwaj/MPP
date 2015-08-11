package lesson9.lab.prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;

public class Method {
	public static void main(String[] args) {

		Set<String> ss = new HashSet<String>();
		ss.add("A");
		ss.add("B");
		
		Set<String> ss1 = new HashSet<String>();
		ss1.add("D");

		Set<String> ss2 = new HashSet<String>();
		ss2.add("1");
		ss2.add("3");
		ss2.add("5");

		List<Set<String>> ls = new ArrayList<>();
		ls.add(ss);
		ls.add(ss1);
		ls.add(ss2);

		System.out.println(ls);
		unionF(ls);

	}

	static final BinaryOperator<Set<String>> SETUNION = new BinaryOperator<Set<String>>() {
		@Override
		public Set<String> apply(Set<String> t, Set<String> u) {
			t.addAll(u);
			return t;
		}
	};

	public static void union(List<Set<String>> sets) {
		Set<String> st = sets.stream().reduce(sets.get(0),
				(a, b) -> SETUNION.apply(a, b));
		System.out.println(st);
	}

	// adding functor in lambda expression
	public static void unionF(List<Set<String>> sets) {
		Set<String> st = sets.stream().reduce(sets.get(0), (a, b) -> {
			a.addAll(b);
			return a;
		});
		System.out.println(st);
	}
}

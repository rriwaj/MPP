package labwo.lesson9.problems.prob6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Runner {
	public static Set<String> union(List<Set<String>> sets) {
		// return sets.stream().reduce(sets.get(0),
		// (Set<String> s1, Set<String> s2) -> {
		// s1.addAll(s2);
		// return s1;
		// });

		// another solution

		return sets.parallelStream().reduce(
				new LinkedHashSet(),
				(Set<String> s1, Set<String> s2) -> new LinkedHashSet<String>(s1) {
					{
						addAll(s2);
					}
				});
	}

	public static void main(String[] args) {
		// Set<String> stringsSet = ;
		List<Set<String>> stringsSetList = new ArrayList<Set<String>>() {
			{
				add(new LinkedHashSet<String>() {
					{
						add("A");
						add("B");
					}
				});
				add(new LinkedHashSet<String>() {
					{
						add("D");
					}
				});
				add(new LinkedHashSet<String>() {
					{
						add("1");
						add("3");
						add("5");
					}
				});
			}
		};

		Set<String> stringSet = union(stringsSetList);
		System.out.println(stringSet);
	}
}

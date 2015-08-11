package lesson10.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capture {
	public static void main(String[] args) {

		reverse(Arrays.asList("a", "b", "c", "d"));
		reverse(Arrays.asList(1, 2, 3, 4, 5));
	}

	public static void reverse(List<?> list) {
		reverseListHelper(list);
	}

	private static <T> void reverseListHelper(List<T> list) {

		List<T> rev = new ArrayList<T>();
		for (int i = list.size() - 1; i >= 0; i--) {
			rev.add(list.get(i));
		}
		System.out.println(rev);
	}
}

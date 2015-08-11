package lesson10.prob5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Double> d = Arrays.asList(1.38, 2.56, 4.3);
		List<LocalDate> dates = Arrays.asList(LocalDate.of(2011, 1, 1),
				LocalDate.of(2012, 12, 22), LocalDate.of(2011, 12, 22));
		List<Integer> ints = Arrays.asList(13, 5, 7, 9, 3, 2, 1);
		System.out.println(secondSmallest(dates));
		System.out.println(secondSmallest(ints));
		System.out.println(secondSmallest(d));
				
		// Integer -> Number -> Object
		// Number -> Object
		// ? extends Integer -> Integer, 
		// ? extends Number -> Number, Integer, Double, Long, BIGINTEGER, BIGDECIMAL
		// ? super Integer -> Integer, Number, Object
		// ? super Number -> Object
		// ? or ? extends Object -> Object, Number, Integer, Double, Long, BIGINTEGER, BIGDECIMAL, String, LocalDate
		
	}

	public static <T extends Comparable<? super T>> T secondSmallest(
			List<T> list) {
		T secondSmall = list.stream().sorted((l1, l2) -> l1.compareTo(l2))
				.limit(2).skip(1).collect(Collectors.toList()).get(0);
		return secondSmall;
	}
}

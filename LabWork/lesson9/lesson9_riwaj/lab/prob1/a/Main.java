package lesson9.lab.prob1.a;

import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		
		// though 1 is printed only once program execution doesnot stops on following code
		IntStream ones = IntStream.generate(() -> 1).distinct();
		//solution
		IntStream onesSol = IntStream.generate(() -> 1).distinct().limit(1);
		onesSol.forEach(System.out::println);
	}
}

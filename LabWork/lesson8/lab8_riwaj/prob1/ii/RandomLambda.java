package lesson8.lab.prob1.ii;

import java.util.function.Supplier;

public class RandomLambda {
	public static void main(String[] args) {
		Supplier<Double> s = Math::random;
		System.out.println(s.get());
				
		
		System.out.println();
	}
	
}
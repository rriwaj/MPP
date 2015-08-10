package labwo.lesson9.problems.prob2;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PrimeStream {

	public void printFirstNPrimes(long n) {
		final Stream<BigInteger> primes = Stream.iterate(BigInteger.ONE,
				BigInteger::nextProbablePrime);
		primes.limit(n).forEach(System.out::println);
	}

	public static void main(String[] args) {
		PrimeStream ps = new PrimeStream(); // PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}
}

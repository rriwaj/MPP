package lesson9.lab.prob2;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {

	// when creating global final primes variable of type Stream once we do
	// terminal
	// operation in stream it is dead so we cannot use that stream again. So we
	// need to declare
	// local variable primes of type stream so it is recreated each time
	final Stream<BigInteger> primes = Stream.iterate(BigInteger.ONE,
			no -> no.add(BigInteger.ONE)).filter(no -> isPrime(no.longValue()));

	public void printFirstNPrimes(long n) {
		final Stream<BigInteger> primes = Stream.iterate(BigInteger.ONE,
				no -> no.add(BigInteger.ONE)).filter(
				no -> isPrime(no.longValue()));
		System.out.println(primeStrings.apply(primes).limit(n)
				.collect(Collectors.joining(" ,")));
	}

	public boolean isPrime(long n) {
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				isPrime = false;
		}
		return isPrime;
	}

	public Function<Stream<BigInteger>, Stream<String>> primeStrings = t -> t
			.map(BigInteger::toString);
}

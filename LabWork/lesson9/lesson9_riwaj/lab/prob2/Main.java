package lesson9.lab.prob2;

public class Main {
	public static void main(String[] args) {
		PrimeStream ps = new PrimeStream(); // PrimeStream is enclosing class
		ps.printFirstNPrimes(15);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}
}

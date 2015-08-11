package lesson8.lab.prob1.iii;

import java.util.function.Supplier;

public class RandomInner {
	class GenerateRandom implements Supplier<Double> {
		@Override
		public Double get() {
			return Math.random();
		}
	}

	static void main(String[] args) {
		RandomInner ri = new RandomInner();
		GenerateRandom ir = ri.new GenerateRandom();
		System.out.println(ir.get());
	}

}

package labwo.lesson7.problems.prob4;

public interface Squeak extends QuackBehavior {

	@Override
	default public void quack() {
		System.out.println("Squeaking annoyingly!");

	}
}

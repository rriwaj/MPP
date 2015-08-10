package labwo.lesson7.problems.prob4;

public interface Quack extends QuackBehavior {

	@Override
	default public void quack() {
		System.out.println("Quacking fluently!");

	}
}

package labwo.lesson7.problems.prob4;

public interface MuteQuack extends QuackBehavior {

	@Override
	default public void quack() {
		System.out.println("Silent perfectly!");

	}
}

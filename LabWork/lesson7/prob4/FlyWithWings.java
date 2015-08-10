package labwo.lesson7.problems.prob4;

public interface FlyWithWings extends FlyBehavior {

	@Override
	default public void fly() {
		System.out.println("Flying with wings!");
	}
}

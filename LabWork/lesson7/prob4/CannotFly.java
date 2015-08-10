package labwo.lesson7.problems.prob4;

public interface CannotFly extends FlyBehavior {

	@Override
	default public void fly() {
		System.out.println("Cannot fly!");
	}
}

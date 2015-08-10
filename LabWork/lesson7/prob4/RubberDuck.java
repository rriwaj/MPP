package labwo.lesson7.problems.prob4;

public class RubberDuck extends Duck implements CannotFly, Squeak {

	@Override
	public void display() {
		System.out.println("I am a Rubber Duck!");
	}

}

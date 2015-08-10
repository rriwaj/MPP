package labwo.lesson7.problems.prob4;

public class DecoyDuck extends Duck implements CannotFly, MuteQuack {

	@Override
	public void display() {
		System.out.println("I am a Decoy Duck!");
	}

}

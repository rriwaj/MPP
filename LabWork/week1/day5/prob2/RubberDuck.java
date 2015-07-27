package week1.day5.prob2;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(new CannotFly(), new Squeak());
	}

	@Override
	public void display() {
		System.out.println("I am a Rubber Duck!");
	}

}

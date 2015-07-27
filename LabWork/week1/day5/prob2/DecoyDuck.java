package week1.day5.prob2;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super(new CannotFly(), new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("I am a Decoy Duck!");
	}

}

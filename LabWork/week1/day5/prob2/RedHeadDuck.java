package week1.day5.prob2;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		super(new FlyWithWings(), new Quack());
	}

	@Override
	public void display() {
		System.out.println("I am a Red Head Duck!");
	}

}

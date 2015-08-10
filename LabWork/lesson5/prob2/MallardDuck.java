package week1.day5.prob2;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super(new FlyWithWings(), new Quack());
	}

	@Override
	public void display() {
		System.out.println("I am a Mallard Duck!");
	}

}

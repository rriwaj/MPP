package labwo.lesson7.problems.prob4;

public abstract class Duck implements FlyBehavior, QuackBehavior {

	public abstract void display();

	public void swim() {
		System.out.println("Swimming!");
	}

}

package labwo.lesson7.problems.prob4;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<Duck>();
		ducks.add(new MallardDuck());
		ducks.add(new RedHeadDuck());
		ducks.add(new RubberDuck());
		ducks.add(new DecoyDuck());

		for (Duck duck : ducks) {
			duck.display();
			duck.fly();
			duck.quack();
			System.out.println();
		}
	}
}

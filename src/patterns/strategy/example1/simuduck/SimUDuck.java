package patterns.strategy.example1.simuduck;

import patterns.strategy.example1.simuduck.ducks.Duck;
import patterns.strategy.example1.simuduck.ducks.MallardDuck;
import patterns.strategy.example1.simuduck.ducks.RubberDuck;

// main app
public class SimUDuck {
	public static void main(String args[]) {
		System.out.println("SimUDuck app is running");
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}
}

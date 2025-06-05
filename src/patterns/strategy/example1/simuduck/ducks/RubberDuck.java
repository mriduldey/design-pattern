package patterns.strategy.example1.simuduck.ducks;

import patterns.strategy.example1.simuduck.behaviors.fly.FlyNoWay;
import patterns.strategy.example1.simuduck.behaviors.quack.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Squeak();
		flybehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("I am a real RubberDuck duck");
	}
	
}

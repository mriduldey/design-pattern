package patterns.strategy.example1.simuduck.ducks;

import patterns.strategy.example1.simuduck.behaviors.fly.FlyWithWings;
import patterns.strategy.example1.simuduck.behaviors.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flybehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I am a real MallerDuck duck");
	}
}

package patterns.strategy.example1.simuduck.ducks;

import patterns.strategy.example1.simuduck.behaviors.fly.FlyBehavior;
import patterns.strategy.example1.simuduck.behaviors.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public abstract void display(); // change based on type of duck, so abstract
	
	public void performFly() {
		flybehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	// All ducks float(common functionality in all ducks), so implement directly 
	// in Duck class as no change expected in swim behavior
	public void swim() {
		System.out.println("Swiming");
	}
}

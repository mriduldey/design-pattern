package patterns.strategy.example1.simuduck.behaviors.fly;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can not fly");
	}
}

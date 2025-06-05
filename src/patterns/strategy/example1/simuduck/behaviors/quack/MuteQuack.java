package patterns.strategy.example1.simuduck.behaviors.quack;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("I can not quack");
	}
}

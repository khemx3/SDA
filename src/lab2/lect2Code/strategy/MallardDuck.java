package lab2.lect2Code.strategy;

public class MallardDuck extends Duck {
 
	public MallardDuck() {
 
		quackBehavior = new Quack();
                flyBehavior = new FlyWithWings();
 

	}
 
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}

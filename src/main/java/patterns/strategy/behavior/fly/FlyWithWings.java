package patterns.strategy.behavior.fly;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying duck");
    }
}
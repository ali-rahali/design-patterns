package design.object.example.strategy.behavior;

/**
 * Rockets to the rescue!
 */
public class RocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("On rocket to the space!");
    }
}

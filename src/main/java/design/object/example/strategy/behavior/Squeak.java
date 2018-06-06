package design.object.example.strategy.behavior;

/**
 * Some creatures like to squeak
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

package design.object.chapter01.behavior;

/**
 * Some creatures like to squeak
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

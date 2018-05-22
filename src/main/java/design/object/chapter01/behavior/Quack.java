package design.object.chapter01.behavior;

/**
 * Ordinary quack, like ducks do
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

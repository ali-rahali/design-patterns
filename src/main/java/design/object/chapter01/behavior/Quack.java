package design.object.chapter01.behavior;

import design.object.chapter01.behavior.QuackBehavior;

/**
 * Ordinary quack, like ducks do
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

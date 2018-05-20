package design.object.chapter01.creature;

import design.object.chapter01.behavior.FlyBehavior;
import design.object.chapter01.behavior.QuackBehavior;

/**
 * Class specifies characteristics and actions which any duck creature might perform
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * Prints how duck looks
     */
    public abstract void display();

    /**
     * Makes duck flying
     */
    public void fly() {
        flyBehavior.fly();
    }

    /**
     * Makes duck quacking
     */
    public void quack() {
        quackBehavior.quack();
    }

    /**
     * Makes duck swimming
     */
    public void swim() {
        System.out.println("Swimming");
    }
}

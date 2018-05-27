package design.object.strategy.creature;

import design.object.strategy.behavior.FlyBehavior;
import design.object.strategy.behavior.QuackBehavior;

/**
 * Class specifies characteristics and actions which any duck creature might perform
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * Changes flying behavior of a {@link Duck} instance on the fly
     *
     * @param flyBehavior - new flying behavior to be used to {@link Duck}
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * Changes quacking behavior of a {@link Duck} instance on the fly
     *
     * @param quackBehavior - new quacking behavior to be used to {@link Duck}
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

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

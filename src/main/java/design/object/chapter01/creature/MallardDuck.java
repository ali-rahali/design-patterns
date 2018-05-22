package design.object.chapter01.creature;

import design.object.chapter01.behavior.FlyWithWings;
import design.object.chapter01.behavior.Quack;

/**
 * Most common wild duck
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}

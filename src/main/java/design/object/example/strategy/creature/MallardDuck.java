package design.object.example.strategy.creature;

import design.object.example.strategy.behavior.FlyWithWings;
import design.object.example.strategy.behavior.Quack;

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

package design.object.strategy.creature;

import design.object.strategy.behavior.FlyNoWay;
import design.object.strategy.behavior.Quack;

/**
 * Toy duck which resembles real one
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}

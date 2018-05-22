package design.object.chapter01.creature;

import design.object.chapter01.behavior.FlyNoWay;
import design.object.chapter01.behavior.Quack;

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

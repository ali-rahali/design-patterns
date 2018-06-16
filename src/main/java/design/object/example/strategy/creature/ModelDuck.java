package design.object.example.strategy.creature;

import design.object.example.strategy.behavior.FlyNoWay;
import design.object.example.strategy.behavior.Quack;

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

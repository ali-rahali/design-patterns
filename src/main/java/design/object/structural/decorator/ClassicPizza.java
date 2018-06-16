package design.object.structural.decorator;

/**
 * Concrete implementation details omitted for pattern brevity
 */
public class ClassicPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Roll the dough");
        System.out.println("Spread tomato pasta");
        System.out.println("Scatter with cheese");
    }
}

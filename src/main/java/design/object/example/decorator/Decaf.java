package design.object.example.decorator;

/**
 * 'Decaf' type of a {@link Beverage}
 */
public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double getCost() {
        return 1.05;
    }
}

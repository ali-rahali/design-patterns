package design.object.example.decorator;

/**
 * 'Espresso' type of a {@link Beverage}
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}

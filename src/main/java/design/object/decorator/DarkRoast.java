package design.object.decorator;

/**
 * "Dark roast' type of a {@link Beverage}
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}

package design.object.decorator;

/**
 * Chocolate condiment
 */
public class Mocha extends Condiment {

    private final double cost = 0.20;
    private final String description = "Mocha";

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return String.join(" ,", this.beverage.getDescription(), this.description);
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + this.cost;
    }
}

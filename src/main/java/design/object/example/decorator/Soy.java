package design.object.example.decorator;

/**
 * Soy condiment
 */
public class Soy extends Condiment {

    private final double cost = 0.35;
    private final String description = "Soy";

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return String.join(", ", this.beverage.getDescription(), this.description);
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + this.cost;
    }
}

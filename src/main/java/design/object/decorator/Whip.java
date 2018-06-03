package design.object.decorator;

public class Whip extends Condiment {

    private final double cost = 0.22;
    private final String description = "Whip";

    public Whip(Beverage beverage) {
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

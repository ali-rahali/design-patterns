package design.object.example.decorator;

/**
 * Base decorator class for condiments
 */
public abstract class Condiment extends Beverage {

    protected final Beverage beverage;

    public Condiment(Beverage beverage) {
        if (beverage == null) {
            throw new IllegalArgumentException("Wrapped object must not be null");
        }
        this.beverage = beverage;
    }

    /**
     * Overridden was made to make specify custom description for a {@link Condiment} subclass
     */
    @Override
    public abstract String getDescription();
}

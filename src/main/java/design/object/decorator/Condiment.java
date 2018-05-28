package design.object.decorator;

/**
 * Base decorator class for condiments
 */
public abstract class Condiment extends Beverage {

    /**
     * Overridden was made to make specify custom description for a {@link Condiment} subclass
     */
    @Override
    public abstract String getDescription();
}

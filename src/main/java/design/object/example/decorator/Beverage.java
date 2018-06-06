package design.object.example.decorator;

/**
 * Class which is used as a super type for decorators nesting
 */
public abstract class Beverage {

    String description = "Unspecified beverage";

    /**
     * Returns description of a beverage
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Returns calculated cost of a beverage
     */
    public abstract double getCost();
}
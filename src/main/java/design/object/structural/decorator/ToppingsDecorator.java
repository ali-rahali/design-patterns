package design.object.structural.decorator;

/**
 * Applies additional toppings to pizza
 */
public abstract class ToppingsDecorator implements Pizza {

    protected final Pizza pizza;

    /**
     * Decorating pizza with additional toppings
     */
    public ToppingsDecorator(Pizza pizza) {
        if (pizza == null) {
            throw new IllegalArgumentException("Cannot apply toppings to non-existing pizza");
        }

        this.pizza = pizza;
    }
}

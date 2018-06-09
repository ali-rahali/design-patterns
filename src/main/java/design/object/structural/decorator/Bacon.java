package design.object.structural.decorator;

/**
 * Bacon topping
 */
public class Bacon extends ToppingsDecorator {

    /**
     * Decorating pizza with additional toppings
     */
    public Bacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void prepare() {
        pizza.prepare();
        System.out.println("Scatter with bacon");
    }
}

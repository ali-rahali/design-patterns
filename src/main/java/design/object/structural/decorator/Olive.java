package design.object.structural.decorator;

/**
 * Olive topping
 */
public class Olive extends ToppingsDecorator {

    /**
     * Decorating pizza with additional toppings
     */
    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void prepare() {
        pizza.prepare();
        System.out.println("Scatter with olives");
    }
}

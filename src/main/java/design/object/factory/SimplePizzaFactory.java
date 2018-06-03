package design.object.factory;

/**
 * A factory class which encapsulates process of {@link Pizza} creation
 */
public class SimplePizzaFactory {

    public Pizza createPizza(Pizza.Type type) {
        if (type == null) {
            throw new IllegalArgumentException("Type has to be specified");
        }

        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            default:
                throw new IllegalArgumentException("Unknown pizza type!");
        }
        return pizza;
    }
}

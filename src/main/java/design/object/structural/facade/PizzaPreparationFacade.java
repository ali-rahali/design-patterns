package design.object.structural.facade;

/**
 * Hides pizza preparation details from client, doesn't allow to misuse {@link PizzaPreparation} API
 */
public class PizzaPreparationFacade {
    private final PizzaPreparation pizzaPreparation;

    public PizzaPreparationFacade(PizzaPreparation pizzaPreparation) {
        if (pizzaPreparation == null) {
            throw new IllegalArgumentException();
        }

        this.pizzaPreparation = pizzaPreparation;
    }

    /**
     * Hides complex system of subsystem
     */
    public void preparePizza() {
        pizzaPreparation.rollDough();
        pizzaPreparation.spreadTomato();
        pizzaPreparation.scatterBacon();
        pizzaPreparation.scatterCheese();
        pizzaPreparation.scatterOlive();
        pizzaPreparation.bake();
        pizzaPreparation.packUp();
    }
}

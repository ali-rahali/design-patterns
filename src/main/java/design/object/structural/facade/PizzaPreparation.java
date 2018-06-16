package design.object.structural.facade;

/**
 * Complex API which will be hidden using facade
 */
public interface PizzaPreparation {
    // some pizza creation related methods
    void rollDough();
    void spreadTomato();
    void scatterCheese();
    void scatterBacon();
    void scatterOlive();
    void bake();
    void packUp();
}

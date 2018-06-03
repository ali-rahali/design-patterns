package design.object.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functionality of {@link Espresso} class
 */
public class EspressoTest {

    /**
     * Initialized instance has to encapsulate its description which can be retrieved by corresponding get method
     */
    @Test
    public void shouldReturnEspresso() {
        Beverage beverage = new Espresso();
        Assert.assertEquals("Espresso", beverage.getDescription());
    }

    /**
     * Initialized instance has to return associated cost
     */
    @Test
    public void shouldReturnCost() {
        Beverage beverage = new Espresso();
        Assert.assertEquals(1.99, beverage.getCost(), 0);
    }
}

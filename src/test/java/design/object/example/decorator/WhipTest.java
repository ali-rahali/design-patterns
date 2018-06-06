package design.object.example.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functionality of a {@link Whip} class
 */
public class WhipTest {

    /**
     * Initialized instance has to encapsulate its description which can be retrieved by corresponding get method
     */
    @Test
    public void shouldReturnComposedDescription() {
        Beverage beverage = new Espresso();
        beverage = new Whip(beverage);

        Assert.assertEquals("Espresso, Whip", beverage.getDescription());
    }

    /**
     * Should return composed cost
     */
    @Test
    public void shouldReturnComposedCost() {
        Beverage beverage = new Espresso();
        beverage = new Whip(beverage);

        Assert.assertEquals(1.99 + 0.22, beverage.getCost(), 0);
    }
}

package design.object.example.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functionality of {@link Soy} class
 */
public class SoyTest {

    /**
     * Initialized instance has to encapsulate its description which can be retrieved by corresponding get method
     */
    @Test
    public void shouldReturnComposedDescription() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);

        Assert.assertEquals("House Blend, Soy", beverage.getDescription());
    }

    /**
     * Should return composed cost
     */
    @Test
    public void shouldReturnComposedCost() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);

        Assert.assertEquals(0.35 + 0.89, beverage.getCost(), 0);
    }
}

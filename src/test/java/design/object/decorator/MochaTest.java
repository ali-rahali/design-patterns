package design.object.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functionality of a {@link Mocha} class
 */
public class MochaTest {

    /**
     * Initialized instance has to encapsulate its description which can be retrieved by corresponding get method
     */
    @Test
    public void shouldReturnComposedDescription() {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);

        Assert.assertEquals("Dark Roast, Mocha", beverage.getDescription());
    }

    /**
     * Should return composed cost
     */
    @Test
    public void shouldReturnComposedCost() {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);

        Assert.assertEquals(1.19, beverage.getCost(), 0);
    }
}

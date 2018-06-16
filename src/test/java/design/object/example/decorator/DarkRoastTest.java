package design.object.example.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functionality of {@link DarkRoast} class
 */
public class DarkRoastTest {

    /**
     * Initialized instance has to encapsulate its description which can be retrieved by corresponding get method
     */
    @Test
    public void shouldReturnDarkRoast() {
        Beverage beverage = new DarkRoast();
        Assert.assertEquals("Dark Roast", beverage.getDescription());
    }

    /**
     * Initialized instance has to return associated cost
     */
    @Test
    public void shouldReturnCost() {
        Beverage beverage = new DarkRoast();
        Assert.assertEquals(0.99, beverage.getCost(), 0);
    }
}

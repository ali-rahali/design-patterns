package design.object.example.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functionality of {@link Decaf} class
 */
public class DecafTest {

    /**
     * Initialized instance has to encapsulate its description which can be retrieved by corresponding get method
     */
    @Test
    public void shouldReturnDecaf() {
        Beverage beverage = new Decaf();
        Assert.assertEquals("Decaf", beverage.getDescription());
    }

    /**
     * Initialized instance has to return associated cost
     */
    @Test
    public void shouldReturnCost() {
        Beverage beverage = new Decaf();
        Assert.assertEquals(1.05, beverage.getCost(), 0);
    }
}

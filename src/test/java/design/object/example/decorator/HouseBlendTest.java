package design.object.example.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functionality of {@link HouseBlend} class
 */
public class HouseBlendTest {

    /**
     * Initialized instance has to encapsulate its description which can be retrieved by corresponding get method
     */
    @Test
    public void shouldReturnHouseBlend() {
        Beverage beverage = new HouseBlend();
        Assert.assertEquals("House Blend", beverage.getDescription());
    }

    /**
     * Initialized instance has to return associated cost
     */
    @Test
    public void shouldReturnCost() {
        Beverage beverage = new HouseBlend();
        Assert.assertEquals(0.89, beverage.getCost(), 0);
    }
}

package design.object.example.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functionality of a {@link Condiment} class
 */
public class CondimentTest {

    /**
     * Should fail to initialize without object to wrap
     */
    @Test
    public void shouldThrowExceptionOnInitializing() {
        try {
            //subclass of Condiment class
            new Mocha(null);
            Assert.fail();
        } catch (IllegalArgumentException ex) {
            //legal to ignore
        }
    }

    /**
     * Should succeed, cuz wrapped object was specified
     */
    @Test
    public void shouldInitialize() {
        new Mocha(new HouseBlend());
    }

}

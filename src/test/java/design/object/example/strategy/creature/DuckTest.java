package design.object.example.strategy.creature;

import design.object.example.strategy.creature.Duck;
import design.object.example.strategy.creature.MallardDuck;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests basic functionality offered by {@link Duck} class
 */
public class DuckTest {
    private final ByteArrayOutputStream customOutputStream = new ByteArrayOutputStream();

    /**
     * Redirects default system output stream to custom one, which is possible to test
     */
    @Before
    public void redirectSystemOutputStream() {
        System.setOut(new PrintStream(customOutputStream));
    }

    /**
     * Restores system default streams
     */
    @After
    public void restoreSystemDefaults() {
        System.setOut(System.out);
    }

    /**
     * Tests swimming capabilities
     */
    @Test
    public void shouldPrintSwimming() {
        Duck duck = new MallardDuck();
        duck.swim();
        Assert.assertEquals(String.format("Swimming%n"), customOutputStream.toString());
    }
}

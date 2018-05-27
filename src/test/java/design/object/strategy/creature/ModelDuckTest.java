package design.object.strategy.creature;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests default behaviors of {@link ModelDuck} instances as well as appearance
 */
public class ModelDuckTest {
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
     * Tests if instance of {@link ModelDuck} class look appropriately
     */
    @Test
    public void shouldPrintAppearance() {
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        Assert.assertEquals(String.format("Model Duck%n"), customOutputStream.toString());
    }

    /**
     * Default {@link ModelDuck} instance isn't able to fly
     */
    @Test
    public void shouldFailToFly() {
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.fly();
        Assert.assertEquals(String.format("Can't fly!%n"), customOutputStream.toString());
    }

    /**
     * Default {@link ModelDuck} instance is able to quack
     */
    @Test
    public void shouldQuack() {
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.quack();
        Assert.assertEquals(String.format("Quack!%n"), customOutputStream.toString());
    }
}

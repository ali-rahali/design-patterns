package design.object.chapter01.creature;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Testing methods of {@link MallardDuck} class
 */
public class MallardDuckTest {
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
     * Tests if instance of {@link MallardDuck} class look appropriately
     */
    @Test
    public void shouldPrintAppearance() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        Assert.assertEquals(String.format("Mallard Duck%n"), customOutputStream.toString());
    }

    /**
     * Tests default flying capabilities of {@link MallardDuck} creature
     */
    @Test
    public void shouldWaveWithWings() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        Assert.assertEquals(String.format("Wings are waving%n"), customOutputStream.toString());
    }

    @Test
    public void shouldQuack() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        Assert.assertEquals(String.format("Quack!%n"), customOutputStream.toString());
    }
}

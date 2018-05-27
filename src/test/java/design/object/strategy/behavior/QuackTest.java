package design.object.strategy.behavior;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests how a {@link Quack} should {@link Quack#quack()}
 */
public class QuackTest {
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
     * Tests quacking of a {@link Quack} instance
     */
    @Test
    public void shouldQuack() {
        QuackBehavior quackBehavior = new Quack();
        quackBehavior.quack();
        Assert.assertEquals(String.format("Quack!%n"), customOutputStream.toString());
    }
}

package design.object.example.strategy.behavior;

import design.object.example.strategy.behavior.MuteQuack;
import design.object.example.strategy.behavior.QuackBehavior;
import design.object.example.strategy.behavior.Squeak;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests how a {@link Squeak} should {@link Squeak#quack()}
 */
public class SqueakTest {
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
     * Tests silence of a {@link MuteQuack} quacking method
     */
    @Test
    public void shouldSqueak() {
        QuackBehavior quackBehavior = new Squeak();
        quackBehavior.quack();
        Assert.assertEquals(String.format("Squeak!%n"), customOutputStream.toString());
    }
}

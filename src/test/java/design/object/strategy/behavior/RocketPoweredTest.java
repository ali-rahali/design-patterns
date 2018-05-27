package design.object.strategy.behavior;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests if a rocket is used properly
 */
public class RocketPoweredTest {
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
     * Tests that {@link RocketPowered} flying behavior has to use rocket
     */
    @Test
    public void shouldUseRocket() {
        FlyBehavior flyBehavior = new RocketPowered();
        flyBehavior.fly();
        Assert.assertEquals(String.format("On rocket to the space!%n"), customOutputStream.toString());
    }
}

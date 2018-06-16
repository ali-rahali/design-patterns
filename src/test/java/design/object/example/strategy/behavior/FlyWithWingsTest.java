package design.object.example.strategy.behavior;

import design.object.example.strategy.behavior.FlyBehavior;
import design.object.example.strategy.behavior.FlyWithWings;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests how a {@link FlyWithWings} offers to {@link FlyWithWings#fly()}
 */
public class FlyWithWingsTest {
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
     * Tests that {@link FlyWithWings} offers means to fly using wings
     */
    @Test
    public void shouldFly() {
        FlyBehavior flyBehavior = new FlyWithWings();
        flyBehavior.fly();
        Assert.assertEquals(String.format("Wings are waving%n"), customOutputStream.toString());
    }
}

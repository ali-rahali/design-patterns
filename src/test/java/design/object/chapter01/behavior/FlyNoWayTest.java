package design.object.chapter01.behavior;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests how a {@link FlyNoWay} offers to {@link FlyNoWay#fly}
 */
public class FlyNoWayTest {
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
     * Tests that a {@link FlyNoWay} doesn't offers means to fly
     */
    @Test
    public void shouldNotFly() {
        FlyBehavior flyBehavior = new FlyNoWay();
        flyBehavior.fly();
        Assert.assertEquals(String.format("Can't fly!%n"), customOutputStream.toString());
    }
}

package design.object.chapter01.behavior;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests how a {@link MuteQuack} should {@link MuteQuack#quack()}
 */
public class MuteQuackTest {
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
    public void shouldNotQuack() {
        QuackBehavior quackBehavior = new MuteQuack();
        quackBehavior.quack();
        Assert.assertEquals(String.format("...%n"), customOutputStream.toString());
    }
}

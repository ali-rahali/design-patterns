package design.object.example.strategy.creature;

import design.object.example.strategy.behavior.FlyNoWay;
import design.object.example.strategy.behavior.Squeak;
import design.object.example.strategy.creature.Duck;
import design.object.example.strategy.creature.MallardDuck;
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

    /**
     * Tests default quacking capabilities of {@link MallardDuck} creature
     */
    @Test
    public void shouldQuack() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        Assert.assertEquals(String.format("Quack!%n"), customOutputStream.toString());
    }

    /**
     * Tests whether it's possible to change flying behavior of a {@link Duck}
     */
    @Test
    public void shouldChangeFlyBehavior() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        String defaultFlyingBehavior = customOutputStream.toString();

        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.fly();
        String newFlyingBehavior = customOutputStream.toString();

        Assert.assertNotEquals(defaultFlyingBehavior, newFlyingBehavior);
    }

    /**
     * Tests whether it's possible to change quacking behavior of a {@link Duck}
     */
    @Test
    public void shouldChangeQuackBehavior() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        String defaultQuackingBehavior = customOutputStream.toString();

        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.quack();
        String newQuackingBehavior = customOutputStream.toString();

        Assert.assertNotEquals(defaultQuackingBehavior, newQuackingBehavior);
    }
}

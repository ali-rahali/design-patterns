package design.object.example.observer;

import design.object.example.observer.CurrentConditionsDisplay;
import design.object.example.observer.WeatherData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests functionality of {@link CurrentConditionsDisplay} class, which was initially constructed to be the part of
 * observer design pattern
 */
public class CurrentConditionsDisplayTest {
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
     * Observer could not exist without associated Subject
     */
    @Test
    public void shouldThroughExceptionOnInitializing() {
        try {
            new CurrentConditionsDisplay(null);
            Assert.fail();
        } catch (IllegalArgumentException ex) {
            //legal to ignore
        }
    }

    /**
     * Each created observer has to be associated with Subject
     */
    @Test
    public void shouldInitialize() {
        new CurrentConditionsDisplay(new WeatherData());
    }

    /**
     * Should display right conditions
     */
    @Test
    public void shouldDisplayCurrentConditions() {
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(new WeatherData());
        display.display();
        Assert.assertEquals(String.format("Current weather conditions: temperature '0.0', humidity '0.0'%n"),
                customOutputStream.toString());
    }

    /**
     * Should change what was displaying
     */
    @Test
    public void shouldChangeDisplay() {
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(new WeatherData());
        double temperature = 1.0;
        double humidity = 2.0;
        double pressure = 3.0;

        display.update(temperature, humidity, pressure);
        Assert.assertEquals(String.format("Current weather conditions: temperature '%s', humidity '%s'%n", temperature, humidity),
                customOutputStream.toString());
    }
}

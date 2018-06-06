package design.object.example.observer;

import design.object.example.observer.TemperatureStatisticsDisplay;
import design.object.example.observer.WeatherData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests functionality of {@link TemperatureStatisticsDisplay} class which was initially designed as part of observer
 * design pattern
 */
public class TemperatureStatisticsDisplayTest {
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
     * Should fail to initialize without associated Subject
     */
    @Test
    public void shouldThroughExceptionOnInitializing() {
        try {
            new TemperatureStatisticsDisplay(null);
            Assert.fail();
        } catch (IllegalArgumentException ex) {
            //legal to ignore
        }
    }

    /**
     * Should succeed, cuz Subject was specified
     */
    @Test
    public void shouldInitialize() {
        new TemperatureStatisticsDisplay(new WeatherData());
    }

    /**
     * Tests whether display outputs temperature statistics
     */
    @Test
    public void shouldDisplayTemperatureStatistics() {
        TemperatureStatisticsDisplay display = new TemperatureStatisticsDisplay(new WeatherData());
        display.display();

        double tempMinDefault = 0.0;
        double tempMaxDefault = 0.0;
        double tempAverageDefault = 0.0;
        Assert.assertEquals(String.format("Average temp: '%s', minimal temp: '%s', maximal temp: '%s'%n",
                tempAverageDefault, tempMinDefault, tempMaxDefault), customOutputStream.toString());
    }

    /**
     * Update invocation should trigger change of what is displayed
     */
    @Test
    public void shouldUpdateMaxTemp() {
        TemperatureStatisticsDisplay display = new TemperatureStatisticsDisplay(new WeatherData());

        double maxTemp = 5.0;
        double minTemp = -5.0;
        double defaultHumidity = 0.0;
        double defaultPressure = 0.0;
        double sum = 0;
        int updatesCount = 0;

        display.update(maxTemp, defaultHumidity, defaultPressure);
        sum += maxTemp;
        updatesCount++;
        Assert.assertEquals(String.format("Average temp: '%s', minimal temp: '%s', maximal temp: '%s'%n",
                sum / (updatesCount == 0.0 ? 1 : updatesCount), 0.0, maxTemp), customOutputStream.toString());
    }

    /**
     * Update invocation should trigger change of what is displayed
     */
    @Test
    public void shouldUpdateMinTemp() {
        TemperatureStatisticsDisplay display = new TemperatureStatisticsDisplay(new WeatherData());

        double minTemp = -5.0;
        double defaultHumidity = 0.0;
        double defaultPressure = 0.0;
        double sum = 0;
        int updatesCount = 0;

        display.update(minTemp, defaultHumidity, defaultPressure);
        sum += minTemp;
        updatesCount++;
        Assert.assertEquals(String.format("Average temp: '%s', minimal temp: '%s', maximal temp: '%s'%n",
                sum / (updatesCount == 0.0 ? 1 : updatesCount), minTemp, 0.0), customOutputStream.toString());
    }
}

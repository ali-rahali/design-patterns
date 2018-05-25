package design.object.observer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functionality of {@link TemperatureStatisticsDisplay} class which was initially designed as part of observer
 * design pattern
 */
public class TemperatureStatisticsDisplayTest {

    @Test
    public void shouldThroughExceptionOnInitializing() {
        try {
            new TemperatureStatisticsDisplay(null);
            Assert.fail();
        } catch (IllegalArgumentException ex) {
            //legal to ignore
        }
    }

    @Test
    public void shouldInitialize() {
        new TemperatureStatisticsDisplay(new WeatherData());
    }
}

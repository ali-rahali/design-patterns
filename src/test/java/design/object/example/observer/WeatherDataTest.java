package design.object.example.observer;

import design.object.example.observer.Observer;
import design.object.example.observer.TemperatureStatisticsDisplay;
import design.object.example.observer.WeatherData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests functionality of {@link WeatherData} class which is a 'Subject' in terms of 'Observer' design pattern
 */
public class WeatherDataTest {
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
     * Plain object initialization should not change default weather conditions
     */
    @Test
    public void shouldNotChangeDefaults() {
        WeatherData weatherData = new WeatherData();
        Assert.assertEquals(weatherData.getTemperature(), 0.0, 0);
        Assert.assertEquals(weatherData.getHumidity(), 0.0, 0);
        Assert.assertEquals(weatherData.getPressure(), 0.0, 0);
    }

    /**
     * Update of weather conditions should change weather related values
     */
    @Test
    public void shouldChangeDefaults() {
        double adjustedTemperature = 10.0;
        double adjustedHumidity = 5.0;
        double adjustedPressure = 20.0;

        WeatherData weatherData = new WeatherData();
        weatherData.updateMeasurements(adjustedTemperature, adjustedHumidity, adjustedPressure);
        Assert.assertEquals(weatherData.getTemperature(), adjustedTemperature, 0);
        Assert.assertEquals(weatherData.getHumidity(), adjustedHumidity, 0);
        Assert.assertEquals(weatherData.getPressure(), adjustedPressure, 0);
    }

    /**
     * Update will not run if new weather condition is the same as old one
     */
    @Test
    public void sameValueShouldNotChange() {
        double adjustedTemperature = 0.0;

        WeatherData weatherData = new WeatherData();
        weatherData.updateMeasurements(adjustedTemperature, weatherData.getHumidity(), weatherData.getPressure());
        Assert.assertEquals(weatherData.getTemperature(), adjustedTemperature, 0);
        Assert.assertEquals(weatherData.getHumidity(), 0.0, 0);
        Assert.assertEquals(weatherData.getPressure(), 0.0, 0);
    }

    /**
     * It's possible to subscribe for weather changes
     */
    @Test
    public void shouldAddObserver() {
        WeatherData weatherData = new WeatherData();
        new TemperatureStatisticsDisplay(weatherData);
        weatherData.updateMeasurements(0.0, 0.0, 0.0);

        Assert.assertEquals(String.format("Average temp: '%s', minimal temp: '%s', maximal temp: '%s'%n",
                0.0, 0.0, 0.0), customOutputStream.toString());

    }

    /**
     * It's possible to unsubscribe from weather changes
     */
    @Test
    public void shouldRemoveObserver() {
        WeatherData weatherData = new WeatherData();
        Observer observer = new TemperatureStatisticsDisplay(weatherData);
        weatherData.removeObserver(observer);

        Assert.assertEquals("", customOutputStream.toString());
    }
}

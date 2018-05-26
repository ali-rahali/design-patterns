package design.object.observer;

/**
 * Observer class in terminology of 'Observer' pattern. Displays temperature statistics.
 */
public class TemperatureStatisticsDisplay implements Observer, Display {
    private double minTemp;
    private double maxTemp;
    private double sumTemp;
    private int updatesCount;
    private Subject weatherData;

    /**
     * Creation of observer mandates to assign it to {@link Subject}
     */
    public TemperatureStatisticsDisplay(Subject weatherData) {
        if (weatherData == null) {
            throw new IllegalArgumentException("Subject must not be null");
        }

        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Average temp: '%s', minimal temp: '%s', maximal temp: '%s'",
                sumTemp / (updatesCount == 0.0 ? 1 : updatesCount), minTemp, maxTemp));
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.sumTemp += temperature;
        this.updatesCount++;

        if (this.minTemp > temperature) {
            this.minTemp = temperature;
        }
        if (this.maxTemp < temperature) {
            this.maxTemp = temperature;
        }

        display();
    }
}

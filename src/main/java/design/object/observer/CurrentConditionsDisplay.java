package design.object.observer;

/**
 * Observer class in terminology of 'Observer' pattern. Displays current weather conditions.
 */
public class CurrentConditionsDisplay implements Display, Observer {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    /**
     * Creation of observer mandates to assign it to {@link Subject}
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        if (weatherData == null) {
            throw new IllegalArgumentException("Subject must not be null");
        }

        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current weather conditions: temperature '%s', humidity '%s'",
                this.temperature, this.humidity));
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        this.display();
    }
}

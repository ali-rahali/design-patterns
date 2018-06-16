package design.object.example.observer;

/**
 * Defines an interface to receive notifications from {@link Subject} object with which an instance is associated
 */
public interface Observer {

    /**
     * Updates an observer with most recent data
     *
     * @param temperature - most recent temperature value
     * @param humidity    - most recent humidity value
     * @param pressure    - most recent pressure value
     */
    void update(double temperature, double humidity, double pressure);
}

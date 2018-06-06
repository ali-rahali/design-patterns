package design.object.example.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Subject class in terminology of 'Observer' pattern. In particular, encapsulates weather related data and
 * notifies subscribed observers if changes to this data occur.
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    /**
     * Initializing with empty collection
     */
    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    /**
     * Plain getter
     */
    public double getTemperature() {
        return this.temperature;
    }

    /**
     * Plain getter
     */
    public double getHumidity() {
        return this.humidity;
    }

    /**
     * Plain getter
     */
    public double getPressure() {
        return this.pressure;
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    private void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    private void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(this::notifyObserver);
    }

    private void notifyObserver(Observer observer) {
        observer.update(
                getTemperature(),
                getHumidity(),
                getPressure()
        );
    }

    /**
     * Updates all measurements
     */
    public void updateMeasurements(double temperature, double humidity, double pressure) {
        updateMeasurement(temperature, getTemperature(), this::setTemperature);
        updateMeasurement(humidity, getHumidity(), this::setHumidity);
        updateMeasurement(pressure, getPressure(), this::setPressure);
        notifyObservers();
    }

    private <T> void updateMeasurement(T newValue, T oldValue, DataUpdater<T> updater) {
        if (Objects.equals(newValue, oldValue)) {
            return;
        }

        updater.update(newValue);
    }

    private interface DataUpdater<T> {
        void update(T value);
    }
}

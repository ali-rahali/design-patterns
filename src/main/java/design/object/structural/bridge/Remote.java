package design.object.structural.bridge;

/**
 * TV-Remote, Car-Remote, Notebook-Remote, ... monolithic hierarchy of classes was split into two different
 * hierarchies of classes: {@link Remote} and {@link Device}
 */
public class Remote {
    // favouring composition over inheritance
    private final Device device;

    public Remote(Device device) {
        if (device == null) {
            throw new IllegalArgumentException("Passed argument must not be null");
        }

        this.device = device;
    }

    /**
     * Switches device on
     */
    public void switchOn() {
        device.switchOn();
    }

    /**
     * Switches device off
     */
    public void switchOff() {
        device.switchOff();
    }
}

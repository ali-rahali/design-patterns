package design.object.structural.bridge;

/**
 * Defines hierarchy of devices which can be manipulated using remotes
 */
public interface Device {
    /**
     * Switches device on
     */
    void switchOn();

    /**
     * Switches device off
     */
    void switchOff();
}

package design.object.observer;

/**
 * Defines an interface for managing pool of observers, notifying each registered with changed data
 */
public interface Subject {

    /**
     * Adds observer to a notification list
     *
     * @param observer to subscribe for updates
     */
    void registerObserver(Observer observer);

    /**
     * Removes observer from a notification list
     *
     * @param observer to unsubscribe from updates
     */
    void removeObserver(Observer observer);

    /**
     * Notifies observers which are contained within notification list
     */
    void notifyObservers();
}

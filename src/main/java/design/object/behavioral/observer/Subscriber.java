package design.object.behavioral.observer;

/**
 * Defines contract for entities who want to subscribe for particular event
 */
public interface Subscriber {

    /**
     * Notifies this subscriber for particular changes
     */
    void notifyMe();
}

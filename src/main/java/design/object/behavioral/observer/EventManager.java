package design.object.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Better approach is to use interface instead of concrete classes to decouple implementation details from client code.
 * But for purposes of this small example it's quite ok.
 * <p>
 * Note: 'Subject' in terminology of Observer design pattern
 */
public class EventManager {

    private final Map<EventType, List<Subscriber>> eventToSubscribers;

    public EventManager() {
        this.eventToSubscribers = new HashMap<>();
    }

    /**
     * @return type of event for which subscription is available ATM
     */
    public EventType[] getEventTypes() {
        return EventType.values();
    }

    /**
     * Allows to subscribe for particular event
     */
    public boolean subscribe(Subscriber subscriber, EventType eventType) {
        if (subscriber == null || eventType == null) {
            return false;
        }

        List<Subscriber> subscribers = getEventSubscribers(eventType);
        return subscribers.add(subscriber);
    }

    /**
     * Allows to unsubscribe from particular event
     */
    public boolean unsubscribe(Subscriber subscriber, EventType eventType) {
        if (subscriber == null || eventType == null) {
            return false;
        }

        List<Subscriber> subscribers = getEventSubscribers(eventType);
        return subscribers.remove(subscriber);
    }

    /**
     * Notifies all subscribers of particular event
     */
    public void notify(EventType eventType) {
        List<Subscriber> subscribers = getEventSubscribers(eventType);
        subscribers.forEach(Subscriber::notifyMe);
    }

    /**
     * @return pull of subscribers
     */
    private List<Subscriber> getEventSubscribers(EventType eventType) {
        List<Subscriber> subscribers = eventToSubscribers.get(eventType);
        if (subscribers == null) {
            subscribers = new ArrayList<>();
            eventToSubscribers.put(eventType, subscribers);
        }
        return subscribers;
    }
}

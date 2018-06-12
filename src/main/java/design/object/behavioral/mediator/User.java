package design.object.behavioral.mediator;

/**
 * Defines contract for users in the system
 */
public class User {

    private final Mediator mediator;
    private final String name;

    public User(Mediator mediator, String name) {
        if (mediator == null) {
            throw new IllegalArgumentException("User cannot communicate without mediator");
        }
        if (name == null) {
            throw new IllegalArgumentException("User name must not be null");
        }

        this.mediator = mediator;
        this.name = name;
    }

    /**
     * Sends message to {@link Mediator}
     */
    public void sendMessage(String message) {
        System.out.println(String.format("%s is sending message", this.name));
        this.mediator.sendMessage(message, this);
    }

    /**
     * Receives message
     */
    public void receiveMessage(String message) {
        System.out.println(String.format("%s is receiving message", this.name));
        System.out.println(message);
    }

    /**
     * Returns name of a user
     */
    public String getName() {
        return name;
    }
}

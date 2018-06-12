package design.object.behavioral.mediator;

/**
 * The main idea behind mediator design pattern is loose coupling between elements of a system.
 * Mediator helps those objects to communicate between each other.
 */
public interface Mediator {

    /**
     * Sends message to other users in the system
     */
    void sendMessage(String message, User user);

    /**
     * Adds new user to the system
     */
    void addUser(User user);
}

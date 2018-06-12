package design.object.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Concrete implementation of {@link Mediator} interface which allows chatting between users
 */
public class Chat implements Mediator {

    private final List<User> users;

    public Chat() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        String senderName = sender.getName();
        users.stream()
                .filter(user -> !Objects.equals(user.getName(), senderName))
                .forEach(user -> user.receiveMessage(message));
    }

    @Override
    public void addUser(User user) {
        if (user == null) {
            return;
        }

        users.add(user);
    }
}

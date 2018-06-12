package design.object.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of {@link Relationship} interface
 */
public class Brotherhood implements Relationship {

    private final List<Companion> friends;
    private final List<Companion> enemies;

    public Brotherhood() {
        this.friends = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    @Override
    public Iterator<Companion> getFriendsIterator() {
        return new IteratorDecorator<>(friends.iterator());
    }

    @Override
    public Iterator<Companion> getEnemiesIterator() {
        return new IteratorDecorator<>(enemies.iterator());
    }

    /**
     * Adds a friend to underlying collection
     */
    public void addFriend(Companion friend) {
        this.friends.add(friend);
    }

    /**
     * Adds an enemy to underlying collection
     */
    public void addEnemy(Companion enemy) {
        this.enemies.add(enemy);
    }
}

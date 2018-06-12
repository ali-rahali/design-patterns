package design.object.behavioral.iterator;

/**
 * Declares iterable collection interface with some mandate method for iterator cleaion
 */
public interface Relationship {

    /**
     * @return {@link Iterator} to loop through the friends
     */
    Iterator<Companion> getFriendsIterator();

    /**
     * @return {@link Iterator} to loop through the enemies
     */
    Iterator<Companion> getEnemiesIterator();
}

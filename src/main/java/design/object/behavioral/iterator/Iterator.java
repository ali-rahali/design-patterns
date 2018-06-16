package design.object.behavioral.iterator;

/**
 * Interface to access elements of a collection sequentially
 */
public interface Iterator<T> {

    /**
     * @return {@code true} if there is element available for traversing
     */
    boolean hasNext();

    /**
     * Return next element
     */
    T getNext();
}

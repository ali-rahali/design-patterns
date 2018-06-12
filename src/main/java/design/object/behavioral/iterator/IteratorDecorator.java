package design.object.behavioral.iterator;

import java.util.Iterator;

/**
 * Wraps over native {@link java.util.Iterator} interface
 */
public class IteratorDecorator<T> implements design.object.behavioral.iterator.Iterator<T> {

    private final java.util.Iterator<T> iterator;

    /**
     * Construct iterator decorator
     */
    public IteratorDecorator(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override
    public T getNext() {
        return this.iterator.next();
    }
}

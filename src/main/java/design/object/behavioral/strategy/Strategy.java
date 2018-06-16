package design.object.behavioral.strategy;

/**
 * Defines common interface for a family of interchangeable algorithms
 */
public interface Strategy {

    /**
     * Performs computation upon provided arguments
     */
    int compute(int left, int right);
}

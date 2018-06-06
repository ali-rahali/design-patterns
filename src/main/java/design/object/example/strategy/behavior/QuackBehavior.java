package design.object.example.strategy.behavior;

/**
 * Interface for quacking capabilities
 */
@FunctionalInterface
public interface QuackBehavior {

    /**
     * Declares how a being quacks
     */
    void quack();
}

package design.object.strategy.behavior;

/**
 * Interface for flying capabilities
 */
@FunctionalInterface
public interface FlyBehavior {

    /**
     * Declares how a being flies
     */
    void fly();
}

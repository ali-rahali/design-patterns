package design.object.creational.singleton;

/**
 * The most basic singleton implementation, but very often is an overkill due to eager initialization of a huge objects
 */
public class EagerSingleton {

    /**
     * Private static field to hold singleton instance
     */
    private static final EagerSingleton SINGLETON_INSTANCE = new EagerSingleton();

    /**
     * Restriction to create instances
     */
    private EagerSingleton() {
    }

    /**
     * Public access point
     */
    public static EagerSingleton getSingletonInstance() {
        return SINGLETON_INSTANCE;
    }
}

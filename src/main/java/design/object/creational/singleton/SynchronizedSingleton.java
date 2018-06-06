package design.object.creational.singleton;

/**
 * Lazy singleton pattern but suitable to use in multi-threaded environment
 */
public class SynchronizedSingleton {

    /**
     * Private field to hold singleton instance
     */
    private static SynchronizedSingleton singletonInstance;

    /**
     * Restriction to create instances
     */
    private SynchronizedSingleton() {
    }

    /**
     * Public access point
     */
    public static synchronized SynchronizedSingleton getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SynchronizedSingleton();
        }
        return singletonInstance;
    }
}

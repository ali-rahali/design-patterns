package design.object.creational.singleton;

/**
 * It's not good idea to use system resources to hold singleton which isn't used by anyone. For this reason lazy
 * singleton pattern was invented.
 * Note: suitable only for single-threaded environment
 */
public class LazySingleton {

    /**
     * Private field to hold singleton instance
     */
    private LazySingleton singletonInstance;

    /**
     * Restriction to create instances
     */
    private LazySingleton() {
    }

    /**
     * Public access point
     */
    public LazySingleton getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new LazySingleton();
        }
        return singletonInstance;
    }
}

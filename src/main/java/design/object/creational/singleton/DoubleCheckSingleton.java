package design.object.creational.singleton;

/**
 * Using synchronized method to implement singleton pattern is sometimes an overkill due to performance reasons which
 * are related of usage of synchronized keyword in method signature.
 * Better approach is to use double check with inner synchronized block.
 */
public class DoubleCheckSingleton {

    /**
     * Private field to hold singleton instance
     */
    private static DoubleCheckSingleton singletonInstance;

    /**
     * Restriction to create instances
     */
    private DoubleCheckSingleton() {
    }

    /**
     * Public access point
     */
    public static DoubleCheckSingleton getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new DoubleCheckSingleton();
                }
            }
        }
        return singletonInstance;
    }
}

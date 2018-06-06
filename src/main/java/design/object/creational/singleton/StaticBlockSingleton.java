package design.object.creational.singleton;

/**
 * Variation of eager singleton pattern, but gives us freedom to apply additional logic in static block
 */
public class StaticBlockSingleton {

    /**
     * Private static field to hold singleton instance
     */
    private static final StaticBlockSingleton SINGLETON_INSTANCE;

    /**
     * Static block to apply additional layers of logic
     */
    static {
        try {
            SINGLETON_INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Restriction to create instances
     */
    private StaticBlockSingleton() {
    }

    /**
     * Public access point
     */
    public static StaticBlockSingleton getSingletonInstance() {
        return SINGLETON_INSTANCE;
    }
}

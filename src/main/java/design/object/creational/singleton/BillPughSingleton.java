package design.object.creational.singleton;

/**
 * Even synchronized implementations have drawback when, is some rare cases, several thread may created different
 * singleton instances.
 * Implementation of Bill Pugh solves this problem.
 */
public class BillPughSingleton {

    /**
     * Restriction to create instances
     */
    private BillPughSingleton() {
    }

    /**
     * Helper class which lazily creates singleton instance of outer class
     */
    private static final class NestedHelperClass {
        private static final BillPughSingleton SINGLETON_INSTANCE = new BillPughSingleton();
    }

    /**
     * Public access point
     */
    public static BillPughSingleton getSingletonInstance() {
        return NestedHelperClass.SINGLETON_INSTANCE;
    }
}

package design.object.creational.singleton;

/**
 * All singleton implementations can be broken using reflection. The only possibility to ensure that singleton is
 * instantiated only once is to use enum
 */
public enum EnumSingleton {

    /**
     * Instance itself, phonically accessible, with intrinsic private constructor
     */
    SINGLETON_INSTANCE;
}

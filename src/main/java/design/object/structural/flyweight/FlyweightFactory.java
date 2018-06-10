package design.object.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight pattern wouldn't be complete without factory which restricts creation of redundant flyweight objects
 */
public class FlyweightFactory {
    private static final Map<String, FlyweightTree> nameToFlyweight = new HashMap<>();

    /**
     * Produces new flyweight object in case it wasn't already created
     */
    public static FlyweightTree produceFlyweight(String name, String color) {
        FlyweightTree flyweightTree = nameToFlyweight.get(name);
        if (flyweightTree == null) {
            flyweightTree = new FlyweightTree(name, color);
            nameToFlyweight.put(name, flyweightTree);
        }
        return flyweightTree;
    }
}

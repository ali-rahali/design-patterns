package design.object.structural.proxy;

import design.object.structural.flyweight.Forest;
import design.object.structural.flyweight.Tree;

/**
 * Sole purpose of a proxy is to delegate all work to encapsulated service applying some additional verification,
 * restriction etc.
 */
public class ForestProxy {

    private final Forest forest;

    public ForestProxy(Forest forest) {
        if (forest == null) {
            throw new IllegalArgumentException();
        }

        this.forest = forest;
    }

    /**
     * Delegates tree growing to underlying object
     */
    public void growTree(int xCoordinate, int yCoordinate, String name, String color) {
        forest.growTree(xCoordinate, yCoordinate, name, color);
    }

    /**
     * Restricts digging out a tree
     */
    public void digOutTree(Tree tree) {
        throw new IllegalStateException("Restriction to dig out a tree");
    }

    /**
     * Delegates rendering to underlying object
     */
    public void render() {
        forest.render();
    }
}

package design.object.structural.flyweight;

/**
 * Composite object which consists of flyweight part which repeats between instances and external fields which differ
 */
public class Tree {
    private final int xCoordinate;
    private final int yCoordinate;
    private final FlyweightTree flyweightTree;

    public Tree(int xCoordinate, int yCoordinate, FlyweightTree flyweightTree) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.flyweightTree = flyweightTree;
    }

    /**
     * Accepts external data which differs between tree objects
     */
    public void draw() {
        flyweightTree.draw(xCoordinate, yCoordinate);
    }
}

package design.object.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Tree forest as one may guess =)
 */
public class Forest {
    private final List<Tree> forest;

    public Forest() {
        this.forest = new ArrayList<>();
    }

    /**
     * Grows new tree in the forest
     */
    public void growTree(int xCoordinate, int yCoordinate, String name, String color) {
        FlyweightTree flyweightTree = FlyweightFactory.produceFlyweight(name, color);
        forest.add(new Tree(xCoordinate, yCoordinate, flyweightTree));
    }

    /**
     * Digs out tree from the forest
     */
    public void digOutTree(Tree tree) {
        forest.remove(tree);
    }

    /**
     * Renders the whole forest
     */
    public void render() {
        forest.forEach(Tree::draw);
    }
}

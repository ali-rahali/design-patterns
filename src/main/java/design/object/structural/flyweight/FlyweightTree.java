package design.object.structural.flyweight;

/**
 * Flyweight fields represent state which is repeating between lots of created objects
 */
public class FlyweightTree {
    private final String name;
    private final String color;

    public FlyweightTree(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * Accepts external data which differs between tree objects
     */
    public void draw(int xCoordinate, int yCoordinate) {
        // some drawing logic
    }
}

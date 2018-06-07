package design.object.creational.prototype;

/**
 * Top-level abstract class which itself mandates to implement clone method
 */
public abstract class Shape {

    private int xCoordinate;
    private int yCoordinate;
    private String color;

    // Default constructor
    public Shape() {
    }

    // Constructor for self clone
    protected Shape(Shape prototype) {
        this.xCoordinate = prototype.xCoordinate;
        this.yCoordinate = prototype.yCoordinate;
        this.color = prototype.color;
    }

    // Method become required to implement
    public abstract Shape clone();
}

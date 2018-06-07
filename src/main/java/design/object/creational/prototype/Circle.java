package design.object.creational.prototype;

/**
 * Sub-class which is required to implement {@link Circle#clone()} method
 */
public class Circle extends Shape {

    private int radius;

    // Default constructor
    public Circle() {
    }

    // Constructor for self clone
    protected Circle(Circle prototype) {
        super(prototype);
        this.radius = prototype.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}

package design.object.behavioral.visitor;

/**
 * Triangle shape
 */
public class Triangle implements Shape {

    private int xCoordinate;
    private int yCoordinate;

    public Triangle(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void draw() {
        // drawing
    }

    @Override
    public void move(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
}

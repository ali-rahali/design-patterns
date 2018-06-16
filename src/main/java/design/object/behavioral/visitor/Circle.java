package design.object.behavioral.visitor;

/**
 * Circle 'O'
 */
public class Circle implements Shape {

    private int xCoordinate;
    private int yCoordinate;

    public Circle(int xCoordinate, int yCoordinate) {
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

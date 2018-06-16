package design.object.behavioral.visitor;

/**
 * Just a square
 */
public class Square implements Shape {

    private int xCoordinate;
    private int yCoordinate;

    public Square(int xCoordinate, int yCoordinate) {
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

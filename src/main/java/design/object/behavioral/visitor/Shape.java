package design.object.behavioral.visitor;

/**
 * Defines a group of geometrical shapes
 */
public interface Shape {

    /**
     * As already mentioned family of {@link Shape} classes is already created, so
     * to apply {@link Visitor} logic we have to follow 'Double dispatch' principle.
     * <p>
     * This method is all about it
     */
    void accept(Visitor visitor);

    /**
     * Draws itself
     */
    void draw();

    /**
     * Moves shape to specified location
     */
    void move(int xCoordinate, int yCoordinate);
}

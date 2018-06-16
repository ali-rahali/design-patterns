package design.object.behavioral.visitor;

/**
 * Sole purpose of a visitor design pattern is to perform some tasks upon already created set of classes without
 * altering already created code
 */
public interface Visitor {

    /**
     * Applies {@link Visitor} logic to {@link Circle} shape
     */
    void visit(Circle circle);

    /**
     * Applies {@link Visitor} logic to {@link Triangle} shape
     */
    void visit(Triangle triangle);

    /**
     * Applies {@link Visitor} logic to {@link Square} shape
     */
    void visit(Square square);
}

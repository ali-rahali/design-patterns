package design.object.behavioral.visitor;

/**
 * Exports current coordinate of a {@link Shape} objects to 'txt' file
 */
public class TxtExporter implements Visitor {

    @Override
    public void visit(Circle circle) {
        // some export logic to txt
    }

    @Override
    public void visit(Triangle triangle) {
        // some export logic to txt
    }

    @Override
    public void visit(Square square) {
        // some export logic to txt
    }
}

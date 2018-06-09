package design.object.structural.adapter;

/**
 * It's possible to depict circle in which square actually fits.
 * For this reason adapter is introduced.
 */
public class SquareToCircleAdapter implements Circle {

    private final Square square;

    /**
     * Actual adapter can only be constructed for {@link Square} objects
     */
    public SquareToCircleAdapter(Square square) {
        if (square == null) {
            throw new IllegalArgumentException("Passed argument must not be null");
        }

        this.square = square;
    }

    /**
     * Adapts {@link Circle} interface methods request to non-related {@link Square} interface.
     * This is the sole purpose of adapter.
     */
    @Override
    public double getRadius() {
        int halfWidth = square.getWidth() / 2;
        int halfLength = square.getLength() / 2;

        return Math.sqrt(halfWidth * halfWidth + halfLength * halfLength);
    }
}

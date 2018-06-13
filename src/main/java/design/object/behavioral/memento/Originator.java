package design.object.behavioral.memento;

/**
 * Originator is a type of object which internal state must be saved without exposing its internal structure
 */
public class Originator {

    private String text;
    private int xCoordinate;
    private int yCoordinate;

    /**
     * Changes text of {@link Originator}
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Changes xCoordinate of a cursor
     */
    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    /**
     * Changes yCoordinate of a cursor
     */
    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    /**
     * Saves current state of {@link Originator}
     */
    public Memento save() {
        return new Memento(this);
    }

    /**
     * Restores backed up state of {@link Originator}
     */
    public void restore(Memento memento) {
        setText(memento.text);
        setXCoordinate(memento.xCoordinate);
        setYCoordinate(memento.yCoordinate);
    }

    /**
     * Inner class which hides allows to hide implementation details of {@link Originator} and at the same time
     * save its internal state
     */
    public static final class Memento {

        private String text;
        private int xCoordinate;
        private int yCoordinate;

        private Memento(Originator originator) {
            this.text = originator.text;
            this.xCoordinate = originator.xCoordinate;
            this.yCoordinate = originator.yCoordinate;
        }
    }
}

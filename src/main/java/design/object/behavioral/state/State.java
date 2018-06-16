package design.object.behavioral.state;

/**
 * Main idea behind State design pattern is a set of interchangeable {@link State} implementation details of which are
 * hidden
 */
public interface State {

    /**
     * Response to outer action
     */
    void respond();
}

package design.object.behavioral.state;

/**
 * {@link State} of an active {@link Smartphone}
 */
public class Active implements State {

    @Override
    public void respond() {
        System.out.println("Some beautiful staff is going on on the screen");
    }
}

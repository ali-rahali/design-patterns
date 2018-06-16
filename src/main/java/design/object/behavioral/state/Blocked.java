package design.object.behavioral.state;

/**
 * Blocked state of a {@link Smartphone}
 */
public class Blocked implements State {

    @Override
    public void respond() {
        System.out.println("Press '*' button twice to unlock");
    }
}

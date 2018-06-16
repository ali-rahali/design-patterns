package design.object.behavioral.state;

/**
 * 'Context' in terminology of State design pattern
 */
public class Smartphone {

    private State state;

    public Smartphone() {
        this.state = new Blocked();
    }

    /**
     * Changes current state
     */
    public void setState(State state) {
        if (state == null) {
            return;
        }

        this.state = state;
    }

    /**
     * Responds to outer action
     */
    public void pressButtons() {
        state.respond();
    }
}

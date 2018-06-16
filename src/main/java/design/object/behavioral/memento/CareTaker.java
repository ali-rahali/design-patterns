package design.object.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Takes care of {@link Originator} history of states
 */
public class CareTaker {

    private final Originator originator;
    private final List<Originator.Memento> history;

    public CareTaker(Originator originator) {
        this.originator = originator;
        this.history = new ArrayList<>();
    }

    /**
     * Put history snapshot of {@link Originator}
     */
    public void saveState() {
        history.add(originator.save());
    }

    /**
     * Restores stored state of {@link Originator}
     */
    public void restoreState() {
        if (history.isEmpty()) {
            return;
        }

        originator.restore(history.remove(history.size() - 1));
    }
}

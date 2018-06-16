package design.object.behavioral.command;

import java.util.List;

/**
 * Prepares food ingredients
 */
public class CookCommand implements Command {

    private final Kitchen kitchen;

    public CookCommand(Kitchen kitchen) {
        if (kitchen == null) {
            throw new IllegalArgumentException();
        }

        this.kitchen = kitchen;
    }

    @Override
    public boolean execute() {
        return cook();
    }

    /**
     * Prepares food
     */
    private boolean cook() {
        List<String> food = this.kitchen.getFood();
        // some food preparation logic
        return true;
    }
}

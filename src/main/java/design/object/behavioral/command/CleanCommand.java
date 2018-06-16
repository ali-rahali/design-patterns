package design.object.behavioral.command;

/**
 * Cleans the house
 */
public class CleanCommand implements Command {

    @Override
    public boolean execute() {
        return cleanHouse();
    }

    /**
     * Command to clean the house
     */
    private boolean cleanHouse() {
        System.out.println("Cleaning house");
        return true;
    }
}

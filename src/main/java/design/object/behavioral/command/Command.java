package design.object.behavioral.command;

/**
 * Declares common interface for all concrete commands
 */
@FunctionalInterface
public interface Command {

    /**
     * Executes command logic
     */
    boolean execute();
}

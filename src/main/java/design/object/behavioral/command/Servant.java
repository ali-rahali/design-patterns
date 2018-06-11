package design.object.behavioral.command;

/**
 * Invoker in terminology of Command design pattern
 */
public class Servant {
    private Command command;

    /**
     * Servant is meant to perform some commands
     */
    public Servant(Command command) {
        this.command = command;
    }

    /**
     * Sets command to be done by
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Executes servant command
     */
    public void executeCommand() {
        if (command == null) {
            return;
        }

        command.execute();
    }
}

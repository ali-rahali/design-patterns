package design.object.behavioral.cor;

/**
 * Internet provider technical support
 */
public class TechSupport {

    private final Operator operator;

    public TechSupport(Operator operator) {
        if (operator == null) {
            throw new IllegalArgumentException("Tech support could not exist without operator chain");
        }

        this.operator = operator;
    }

    /**
     * Initiates support process
     */
    public boolean help(String problem) {
        System.out.println("Please stand by. Operator with help you with the problem.");
        return operator.help(problem);
    }
}

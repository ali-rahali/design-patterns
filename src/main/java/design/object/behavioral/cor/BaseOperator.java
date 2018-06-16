package design.object.behavioral.cor;

/**
 * Reduces boiler plate code, implements some common logic shared between {@link Operator} instances
 */
public abstract class BaseOperator implements Operator {

    private Operator linkedOperator;

    /**
     * Fluent API =)
     */
    @Override
    public Operator linkWith(Operator operator) {
        this.linkedOperator = operator;
        return operator;
    }

    /**
     * If there's no linked operator, we can assume that client didn't received help
     *
     * @param problem
     * @return
     */
    @Override
    public boolean delegate(String problem) {
        if (linkedOperator == null) {
            return false;
        }

        return linkedOperator.help(problem);
    }
}

package design.object.behavioral.cor;

/**
 * Technical support consists of chain of operator. Interface declares mandate functions each operator has to perform
 */
public interface Operator {

    /**
     * Links with the next operator, to whom request will be delegated in case that one could not cope with a problem
     */
    Operator linkWith(Operator operator);

    /**
     * Tries to help with client's problem
     */
    boolean help(String problem);

    /**
     * Delegates problem to the next operator in the chain
     */
    boolean delegate(String problem);
}

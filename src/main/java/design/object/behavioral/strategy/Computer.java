package design.object.behavioral.strategy;

/**
 * Performs computations
 */
public class Computer {

    private Strategy strategy;

    public Computer(Strategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Computing strategy must not be null");
        }
    }

    /**
     * It's possible to provide new custom computing strategy
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * @return result of computation
     */
    public int compute(int left, int right) {
        return strategy.compute(left, right);
    }
}

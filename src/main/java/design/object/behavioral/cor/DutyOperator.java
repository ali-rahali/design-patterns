package design.object.behavioral.cor;

import java.util.HashMap;
import java.util.Map;

/**
 * Operator which deals with more sophisticated problems
 */
public class DutyOperator extends BaseOperator {

    private final Map<String, String> faq;

    public DutyOperator() {
        this.faq = new HashMap<>();
    }

    /**
     * Live operator which has some more options for help
     */
    @Override
    public boolean help(String problem) {
        String solution = faq.get(problem);
        if (solution != null) {
            System.out.println(solution);
            return true;
        }

        return delegate(problem);
    }
}

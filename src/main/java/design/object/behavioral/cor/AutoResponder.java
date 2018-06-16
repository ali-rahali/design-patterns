package design.object.behavioral.cor;

/**
 * Some prerecorded help messages which are usually solve most of the problems
 */
public class AutoResponder extends BaseOperator {

    /**
     * Some predefined help pattern for auto responder
     */
    @Override
    public boolean help(String problem) {
        if (problem == null) {
            return true;
        }

        switch (problem.toLowerCase()) {
            case "connection":
                System.out.println("Check cables");
                return true;
            case "sound":
                System.out.println("Volume up");
                return true;
            case "screen":
                System.out.println("Update graphics driver");
                return true;
            default:
                return delegate(problem);
        }
    }

}

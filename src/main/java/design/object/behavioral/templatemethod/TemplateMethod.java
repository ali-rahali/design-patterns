package design.object.behavioral.templatemethod;

/**
 * Defines series of the steps in particular order. This order cannot be changed but each step can be altered by
 * subclass implementation
 */
public class TemplateMethod {

    /**
     * Main template method which defines series of steps of ordinary daily routine
     */
    public final void dailyRoutine() {
        wakeUp();
        makeBed();
        shower();
        goToWork();
        work();
        goHome();
        homeDuties();
        glassOfWhiskey();
        sleep();
    }

    /**
     * Wake up routine
     */
    protected void wakeUp() {
        System.out.println("Waking up");
    }

    /**
     * Making the bed routine
     */
    protected void makeBed() {
        System.out.println("Making the bed");
    }

    /**
     * Shower routine
     */
    protected void shower() {
        System.out.println("Washing in the shower");
    }

    /**
     * Going to work routine
     */
    protected void goToWork() {
        System.out.println("On my way to work");
    }

    /**
     * At work
     */
    protected void work() {
        System.out.println("... working ...");
    }

    /**
     * Going home routine
     */
    protected void goHome() {
        System.out.println("On my way home");
    }

    /**
     * Eliminating home duties
     */
    protected void homeDuties() {
        System.out.println("Some work with home duties");
    }

    /**
     * Drinking a glass of whiskey
     */
    protected void glassOfWhiskey() {
        System.out.println("After long working day...");
    }

    /**
     * Sleeping routine
     */
    protected void sleep() {
        System.out.println("... zzz ...");
    }
}

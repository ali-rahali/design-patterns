package design.object.behavioral.state;

/**
 * Send notification details to charge device
 */
public class Discharged implements State {

    private static final int WARN_DELAY = 5000;

    @Override
    public void respond() {
        while (true) {
            try {
                Thread.sleep(WARN_DELAY);
                warnToCharge();
            } catch (InterruptedException e) {
                // ignore for education purposes;
            }
        }
    }

    private void warnToCharge() {
        System.out.println("Please charge device");
    }
}

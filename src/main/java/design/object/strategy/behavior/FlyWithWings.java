package design.object.strategy.behavior;

/**
 * For creatures who are flying using wings
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Wings are waving");
    }
}

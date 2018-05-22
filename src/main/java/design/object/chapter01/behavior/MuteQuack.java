package design.object.chapter01.behavior;

/**
 * Some duck species cannot quack
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("...");
    }
}

package duckBehaviours.quackables;

/**
 *  Normal quacking behaviour
 */
public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quacks");
    }
}

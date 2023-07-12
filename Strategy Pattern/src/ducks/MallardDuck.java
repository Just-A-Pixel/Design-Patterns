package ducks;

import duckBehaviours.flyables.FlyWithWings;
import duckBehaviours.quackables.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    /**
     *  Enable mallard swim
     */
    @Override
    public void swim() {
        System.out.println("swim");
    }

    /**
     *  Display
     */
    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}

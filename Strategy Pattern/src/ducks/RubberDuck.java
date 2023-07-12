package ducks;

import duckBehaviours.flyables.CannotFly;
import duckBehaviours.quackables.Squeaks;

public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehaviour = new Squeaks();
        flyBehaviour = new CannotFly();
    }

    @Override
    public void swim() {
        System.out.println("Rubber duck is swimming");
    }
}

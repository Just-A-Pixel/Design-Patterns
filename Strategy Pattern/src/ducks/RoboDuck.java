package ducks;

import duckBehaviours.flyables.FlyWithJetPack;
import duckBehaviours.quackables.Quack;
import duckBehaviours.weapons.LaserEyes;

public class RoboDuck extends Duck{
    public RoboDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithJetPack();
        weaponBehaviour = new LaserEyes();
    }

    @Override
    public void swim() {
        System.out.println("RoboDuck is waterproof! It swims.");
    }
}

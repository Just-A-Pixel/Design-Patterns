package ducks;

import duckBehaviours.flyables.FlyBehaviour;
import duckBehaviours.quackables.QuackBehaviour;
import duckBehaviours.weapons.WeaponBehaviour;

public abstract class Duck {

    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    WeaponBehaviour weaponBehaviour;

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public void fly() {
        flyBehaviour.fly();
    }
    public void swim() {
    }

    public void useWeapon() {
        weaponBehaviour.useWeapon();
    }

    public void display() {
    };
}

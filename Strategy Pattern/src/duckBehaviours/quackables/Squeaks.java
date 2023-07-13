package duckBehaviours.quackables;

/*
* Squeak behaviour for rubbery ducks
*/
public class Squeaks implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

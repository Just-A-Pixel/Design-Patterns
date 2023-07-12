import ducks.Duck;
import ducks.MallardDuck;
import duckBehaviours.flyables.FlyWithJetPack;
import duckBehaviours.quackables.Squeaks;
import ducks.RoboDuck;
import ducks.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck robot = new RoboDuck();

        /* Default Behaviours */
        mallard.quack();
        rubber.swim();
        robot.fly();

        /* Dynamically changing functionality */
        System.out.print("Mallard " );
        mallard.fly();
        mallard.setFlyBehaviour(new FlyWithJetPack());
        System.out.print("Mallard " );
        mallard.fly();

        /* Add unique default behaviour without depending on other duck classes */
        robot.useWeapon();
    }
}
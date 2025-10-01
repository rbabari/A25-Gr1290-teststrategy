
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // avoir un objet robot qui change de comportemnt
        Robot robot1 = new Robot("Robot Cop");
        Robot robot2 = new Robot("Robot Cop2");
        Robot robot3 = new Robot("Robot Cop3");

        Robot robot4 = new Robot(robot3);
        Robot robot5 = robot3;

        robot1.setBehaviour(new AgressifBehaviour());
        robot2.setBehaviour(new DeffensifBehaviour());
        robot3.setBehaviour(new NormalBehaviour());
        robot3.move();
        robot3.setBehaviour(new DeffensifBehaviour());
        robot3.move();
        // Expression Lambda
        // Le parametre Implemente une interface qui contient
        // Une seule methode abstraite ...
        robot3.setBehaviour(()->{
            // Corps de la seule méthode abstraite moveCommand
            System.out.println("Nouveau behaviour");
        });
        robot3.move();


    }
}
/**
 *
 */
public class Robot {
    private String name;
    private IBehaviour behaviour;

    // par default == public ??? non

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructeur de copy
     * @param robot copy un robot
     */
    public Robot(Robot robot) {
        this. name = robot.name;
        this.behaviour = robot.behaviour;
    }

    /**
     * constructeur avec parametre
     * @param nom de type String
     * @param behaviour de type IBehaviour ...
     */
    public Robot(String nom,  IBehaviour behaviour) {
        this. name = nom;
        this.behaviour = behaviour;
    }
    /**
     * constructeur avec parametre
     * @param nom String ...
     */
    public Robot(String nom) {
        name = nom;
    }

    /**
     * constructeur sans parametre
     */
    public Robot() {
        name = "";
    }


    public void setBehaviour(IBehaviour behaviour) {

        this.behaviour = behaviour;
    }

    public void move() {
        System.out.print ("Moving " + this.name + " ");
        this.behaviour.moveCommand();
    }
}

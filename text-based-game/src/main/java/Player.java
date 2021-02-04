import java.awt.print.Book;

public class Player {
    private int healthPoints;
    private String name;
    private Boolean hasKey;

    /**
     * Creates a player with a certain amount of healthpoints and a name.
     * @param healthPoints
     * @param name
     */
    public Player(int healthPoints, String name) {
        this.healthPoints = healthPoints;
        this.name = name;
        this.hasKey = false;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * A method that removes healthpoints from the player and prints out game is over if health < 0.
     * @param damage
     */
    public void takeDamage(int damage) {
        this.healthPoints -= damage;

        if (this.healthPoints <= 0) {
            System.out.println("The game is over");
        }
    }

    /**
     * If the player picks up the key he gets a printout. 
     * @param hasKey
     */
    public void setHasKey(Boolean hasKey) {
        if(hasKey) {
            System.out.println("You now have the key in your inventory!");
        }
        this.hasKey = hasKey;
    }

    public boolean getHasKey() {
        return this.hasKey;
    }

    public int gethealthpoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

}